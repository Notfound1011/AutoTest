package app.testcase;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;

public class IosTujia {

    private IOSDriver driver;

    @Before
    public void setUp() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
//        desiredCapabilities.setCapability("platformName", "ios");
//        desiredCapabilities.setCapability("platformVersion", "12.0");
        desiredCapabilities.setCapability("deviceName", "霸霸");
        desiredCapabilities.setCapability("udid", "auto");
        desiredCapabilities.setCapability("xcodeOrgId", "LHQ87MAB9L");
//        desiredCapabilities.setCapability("xcodeSigningId", "iPhone Developer");
        desiredCapabilities.setCapability("usePrebuiltWDA", true);
        desiredCapabilities.setCapability("noReset", true);
        desiredCapabilities.setCapability("automationName", "XCUITest");
        desiredCapabilities.setCapability("bundleId", "com.tujia.tujia");

        URL remoteUrl = new URL("http://localhost:4723/wd/hub");

        driver = new IOSDriver(remoteUrl, desiredCapabilities);
    }

    @Test
    public void sampleTest() throws InterruptedException {
        driver.findElementByXPath("//*[@name=\"开始搜索\"]").click();
//        MobileElement el1 = (MobileElement) driver.findElementByXPath("//*[@name=\"其他方式登录\"]");
//        el1.click();
//        MobileElement el2 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"途家民宿\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeTextField");
//        el2.sendKeys("18601405271");
//        MobileElement el3 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"途家民宿\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeSecureTextField");
//        el3.sendKeys("shiyuyu288");
//        MobileElement el4 = (MobileElement) driver.findElementByAccessibilityId("登录");
//        el4.click();
//        Thread.sleep(10000);
//        MobileElement el5 = (MobileElement) driver.findElementByAccessibilityId("点击按钮开始智能验证");
//        el5.click();
        Thread.sleep(10000);
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}


