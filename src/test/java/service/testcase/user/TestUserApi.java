package service.testcase.user;

import org.junit.Test;
import service.api.user.UserApi;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class TestUserApi {

    @Test
    public void get(){
        UserApi user=new UserApi();
        user.getUser("seveniruby").then().body("errcode", equalTo(0));
    }
}
