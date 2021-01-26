package service.testcase.ctripHotel;

import framework.LogBuild;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

import io.restassured.response.ValidatableResponseOptions;
import org.junit.jupiter.api.*;
import org.apache.log4j.Logger;

import static framework.AllureLog.addLogToFile;
import static framework.AllureLog.addHttpLogToAllure;
import static org.hamcrest.Matchers.equalTo;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class TestCtripHotel {
    static ctripHotel ctripHotel = new ctripHotel();
    private static final Logger logger= Logger.getLogger(TestCtripHotel.class);

    @BeforeAll
    public void beforeAll(){
        addLogToFile();
    }


    @Severity(SeverityLevel.CRITICAL)
    @Story("酒店房型静态信息接口")
    @Test
    public void HotelRoomStaticInfoTest() {
        logger.info("### 执行测试用例：发送请求 ###");
        ctripHotel.hotelRoomStaticInfo("44208481")
                .then().body("ResponseStatus.Ack",equalTo("Success"));
    }


    @AfterAll
    public void afterAll(){
        addHttpLogToAllure();
    }

}