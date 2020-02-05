package base;

import capabilities.BaseClass;
import constants.Constants;
import factories.StartPageFactory;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import pages.APIDemoStartPage;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import static constants.Constants.DEVICE_NAME_SVETLANA;
import static constants.Constants.ULR_LOCAL_APPIUM;

public class BaseTest {

    private DesiredCapabilities capabilities;
    protected AndroidDriver androidDriver;
    protected APIDemoStartPage apiDemoStartPage;
    protected StartPageFactory startPageFactory;
    private BaseClass baseClass;
    protected File apk;

    @BeforeClass
    public void setup() throws MalformedURLException {
        baseClass = new BaseClass();
        apk = new File(getClass().getClassLoader().getResource(Constants.APP_NAME).getFile());
        capabilities = baseClass.setDesiredCapabilities(apk, DEVICE_NAME_SVETLANA);
        androidDriver = new AndroidDriver(new URL(ULR_LOCAL_APPIUM), capabilities);
    }

}
