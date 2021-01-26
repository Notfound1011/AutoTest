package app.testcase;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class SimulatorAppium {

    private IOSDriver driver;

    @Before
    public void setUp() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "ios");
        desiredCapabilities.setCapability("platformVersion", "13.7");
        desiredCapabilities.setCapability("deviceName", "iPhone 11 Pro Max");
        desiredCapabilities.setCapability("app", "/Users/shiyuyu/Library/Developer/Xcode/DerivedData/UIKitCatalog-gxbgqhumklioigazyyhliqbjzifh/Build/Products/Debug-iphonesimulator/UIKitCatalog.app");

        URL remoteUrl = new URL("http://localhost:4723/wd/hub");

        driver = new IOSDriver(remoteUrl, desiredCapabilities);
    }

    @Test
    public void sampleTest() throws InterruptedException {
        driver.findElementByAccessibilityId("Alert Views").click();
        Thread.sleep(3000);

        Boolean b = driver.findElementByName("ALERT STYLE").isDisplayed();
        assertTrue(b);
        System.out.println("断言成功");

    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
