package service;

import io.restassured.RestAssured;
import io.restassured.config.LogConfig;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class Work {

    String token;
    String accessToken;

    private Work(){}   //私有构造函数
    private static Work instance = null;  //单例对象
    public static Work getInstance() {
        if (instance == null) {      //双重检测机制
            synchronized (Work.class){  //同步锁
                if (instance == null) {     //双重检测机制
                    instance = new Work();
                }
            }
        }
        return instance;
    }

    public String getToken() {
        if (token == null) {
            token = given()
                    .param("corpid", "wwd6da61649bd66fea")
                    .param("corpsecret", "C7uGOrNyxWWzwBsUyWEbLdbZBDrc71PNOhyQ_YYPhts")
                    .when()
                    .log().all()
                    .get("https://qyapi.weixin.qq.com/cgi-bin/gettoken")
                    .then()
                    .log().all()
//                    .body("errcode", equalTo(0))
                    .extract()
                    .body().path("access_token");
            System.out.println(token);
        }
        return token;
    }

    public String getAccessToken() {
        if (accessToken == null) {
            token = given()
                    .param("AID", "592427")
                    .param("SID", "1117839")
                    .param("KEY", "fb8d8a1628a94e5d971344437cb6c2be")
                    .when()
                    .log().all()
                    .get("http://openservice.ctrip.com/openserviceauth/authorize.ashx")
                    .then()
                    .log().all()
                    .statusCode(equalTo(200))
//                    .body("status", equalTo(200))
                    .extract()
                    .body().path("Access_Token");
            System.out.println(token);
        }
        return token;
    }

}
