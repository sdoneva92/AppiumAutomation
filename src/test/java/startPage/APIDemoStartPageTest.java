package startPage;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.APIDemoStartPage;

import java.net.MalformedURLException;
import java.net.URL;

public class APIDemoStartPageTest {

    private DesiredCapabilities capabilities;
    private AndroidDriver androidDriver;
    private APIDemoStartPage apiDemoStartPage;

    @BeforeClass
    public void setup() throws MalformedURLException {

        capabilities = new DesiredCapabilities();

        capabilities.setCapability("deviceName", "SVETLANA");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("automationName", "UiAutomator2");
        capabilities.setCapability("app", "C:\\Users\\svetlana.doneva\\Desktop\\AppiumAutomation\\src\\test\\resources\\ApiDemos-debug.apk");
        capabilities.setCapability("appPackage", "io.appium.android.apis");
        capabilities.setCapability("appActivity", "io.appium.android.apis.ApiDemos");

        androidDriver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }


    @Test
    public void clickOnStartPageButtons() throws InterruptedException {

        apiDemoStartPage = new APIDemoStartPage(androidDriver);

        apiDemoStartPage.clickOnContinueButton();
        Thread.sleep(600);
        apiDemoStartPage.clickOkButton();
        Thread.sleep(600);
        apiDemoStartPage.clickAccessibilityButton();
    }
}
