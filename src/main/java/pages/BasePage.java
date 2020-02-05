package pages;

import io.appium.java_client.android.AndroidDriver;

public class BasePage {

    protected AndroidDriver driver;

    public void setDriver(AndroidDriver driver) {
        this.driver = driver;
    }
}
