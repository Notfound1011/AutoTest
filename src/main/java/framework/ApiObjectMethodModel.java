package framework;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.log4j.Logger;
import service.Work;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class ApiObjectMethodModel {
    private final org.apache.log4j.Logger logger= Logger.getLogger(ApiObjectMethodModel.class);
    private HashMap<String, Object> params;
    public HashMap<String, Object> query;
    public HashMap<String, Object> header;
    public HashMap<String, Object> postBody;
    public String postBodyRaw;
    public String method = "";
    public String url = "";

    // 处理request
    public Response run() {
        RequestSpecification request = given();
        request.queryParam("access_token", Work.getInstance().getToken());

        // 读取HashMap中的key: query,增加到request请求体的query中
        if (query != null) {
            query.forEach((key, value) -> request.queryParam(key, repalce(value.toString())));
        }

        // 读取HashMap中的key: header,增加到request请求体的query中
        if (header != null) {
            assert query != null;
            query.forEach((key, value) -> request.header(key, repalce(value.toString())));

//            query.entrySet().forEach(entry -> {
//                request.header(entry.getKey(), repalce(entry.getValue().toString()));
//            });
        }

        if (postBody != null) {
            //todo: replace hashmap
            request.body(postBody);
        }
        if (postBodyRaw != null) {
            request.body(repalce(postBodyRaw));
        }
        logger.info("request是:");
        return request
                .when().log().all().request(method, url)
                .then().log().all().extract().response();
    }

    public String repalce(String raw){
        for (Map.Entry<String, Object> kv : params.entrySet()) {
            String matcher = "${" + kv.getKey() + "}";
            if (raw.contains(matcher)) {
                System.out.println(kv);
                raw = raw.replace(matcher, kv.getValue().toString());
            }
        }
        return raw;
    }

    private Map<String, String> logMap = new HashMap<>();
    public String toString() {
        StringBuilder logStr = new StringBuilder();
        if (logMap == null || logMap.size() <= 0) {
            return logStr.toString();
        }
        for (Map.Entry<String, String> log : logMap.entrySet()) {
            logStr.append(String.format("%s=%s;", log.getKey(), log.getValue()));
        }
        logMap.clear();
        return logStr.toString();
    }

    public Response run(HashMap<String, Object> params) {
        this.params=params;
        return run();
    }
}
