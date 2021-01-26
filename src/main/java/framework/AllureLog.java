package framework;

import io.qameta.allure.Allure;
import io.restassured.RestAssured;
import io.restassured.config.LogConfig;
import java.io.*;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

public class AllureLog {
    static String testClassName = Thread.currentThread().getStackTrace()[2].getClassName();
    static String logPath ="./logs/"+testClassName+".log";

    public static void addLogToFile(){
        try {
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(logPath));
            PrintStream printStream = new PrintStream(bos, true);
            RestAssured.config = RestAssured.config().logConfig(LogConfig.logConfig().defaultStream(printStream));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void addHttpLogToAllure() {
        try {
            Allure.addAttachment("接口请求响应日志" , new FileInputStream(logPath));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void addHttpLogToAllure(String logPath) {
        try {
            Allure.addAttachment("接口请求响应日志" , new FileInputStream(logPath));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


//    @Test
//    void testAllureReport(){
//        addLogToFile(); //每次请求将测试log输出到文件中
//        addHttpLogToAllure(); //每次请求后将log文件以附件形式保存到allure中
//    }

}
