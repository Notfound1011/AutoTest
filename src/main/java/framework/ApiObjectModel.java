package framework;

import io.restassured.response.Response;
import java.util.HashMap;

public class ApiObjectModel {
    public HashMap<String, ApiObjectMethodModel> methods = new HashMap<>();

    public ApiObjectMethodModel getMethod(String method) {
        return methods.get(method);  // HashMap的get方法获取method数据节点
    }

    // 无占位符变量(yaml文件)
    public Response run(String method) {
        return getMethod(method).run();
    }

    // 有占位符变量(yaml文件)
    public Response run(String method, HashMap<String, Object> params) {
        return getMethod(method).run(params);
    }
}
