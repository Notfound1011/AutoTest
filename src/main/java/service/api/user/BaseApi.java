package service.api.user;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.github.mustachejava.DefaultMustacheFactory;
import com.github.mustachejava.Mustache;
import com.github.mustachejava.MustacheFactory;
import framework.AllureLog;
import framework.ApiObjectModel;
import io.restassured.response.Response;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.HashMap;


public class BaseApi {
    private final Logger logger= Logger.getLogger(BaseApi.class);

    ApiObjectModel model = new ApiObjectModel();
    HashMap<String, Object> params;

    public Response parseSteps() {
        // 线程堆栈转储的堆栈跟踪元素数组； 取第三个,通过获取调用类的方法名。funcName函数名，区别于后面定义的http请求的method
        String funcName = Thread.currentThread().getStackTrace()[2].getMethodName();
        if(model.methods.entrySet().isEmpty()) {
            logger.info("pom first load");
            // path为调用parseSteps方法的运行类名称一致的路径，/service/api/user/UserApi.yaml
            String path = "/" + this.getClass().getCanonicalName().replace('.', '/') + ".yaml";

            ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
            try {
                // 读取YAML文件， 加载ApiObjectModel中定义的对象：文件为resource资源目录下对应同名的path
                model = mapper.readValue(BaseApi.class.getResourceAsStream(path), ApiObjectModel.class);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return model.run(funcName, params);
    }

    public void setParams(HashMap<String, Object> data){
        params=data;
    }

    public String template(String templatePath, HashMap<String, Object> data){
        Writer writer = new StringWriter();
        MustacheFactory mf = new DefaultMustacheFactory();
        Mustache mustache = mf.compile(this.getClass().getResource(templatePath).getPath());
        mustache.execute(writer, data);
        try {
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return writer.toString();
    }
}
