package startPage;

import capabilities.BaseClass;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.APIDemoStartPage;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import static constants.Constants.DEVICE_NAME_SVETLANA;
import static constants.Constants.ULR_LOCAL_APPIUM;

public class APIDemoStartPageTest {

    private DesiredCapabilities capabilities;
    private AndroidDriver androidDriver;
    private APIDemoStartPage apiDemoStartPage;
    private BaseClass baseClass;
    private File apk;

    @BeforeClass
    public void setup() throws MalformedURLException {
        baseClass = new BaseClass();
        apk = new File(getClass().getClassLoader().getResource("ApiDemos-debug.apk").getFile());
        capabilities = baseClass.setDesiredCapabilities(apk, DEVICE_NAME_SVETLANA);
        androidDriver = new AndroidDriver(new URL(ULR_LOCAL_APPIUM), capabilities);
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
