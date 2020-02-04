package capabilities;

import constants.Constants;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;

import static constants.Constants.*;

public class BaseClass {
    public DesiredCapabilities setDesiredCapabilities(File apkFile, String deviceName) {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability(Constants.DEVICE_NAME_KEY, deviceName);
        capabilities.setCapability(Constants.PLATFORM_NAME_KEY, PLATFORM_NAME_ANDROID);
        capabilities.setCapability(AUTOMATION_NAME_KEY, AUTOMATION_NAME_UIAUTOMATOR_2);
        capabilities.setCapability(Constants.APP_KEY, apkFile.getAbsolutePath());
        capabilities.setCapability(APP_PACKAGE_KEY, APP_PACKAGE_NAME);
        capabilities.setCapability(APP_ACTIVITY_KEY, APP_ACTIVITY_NAME);

        return capabilities;
    }
}
