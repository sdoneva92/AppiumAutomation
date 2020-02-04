package capabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Caps {


    public static void main(String... args) throws MalformedURLException, InterruptedException {

        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("deviceName", "SVETLANA");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("automationName", "UiAutomator2");
        capabilities.setCapability("app", "C:\\Users\\svetlana.doneva\\Desktop\\AppiumAutomation\\src\\test\\resources\\ApiDemos-debug.apk");
        capabilities.setCapability("appPackage", "io.appium.android.apis");
        capabilities.setCapability("appActivity", "io.appium.android.apis.ApiDemos");

        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

        AndroidElement continueElement = (AndroidElement) driver.findElement(By.id("com.android.permissioncontroller:id/continue_button"));
        continueElement.click();

        Thread.sleep(400);

        AndroidElement okButton = (AndroidElement) driver.findElement(By.id("android:id/button1"));
        okButton.click();

        Thread.sleep(600);

        AndroidElement accessibilityButton = (AndroidElement) driver.findElement(By.xpath("//android.widget.TextView[@content-desc='Accessibility']"));
        accessibilityButton.click();

        Thread.sleep(600);

        AndroidElement nodeProviderElement = (AndroidElement) driver.findElement(By.xpath("//android.widget.TextView[@content-desc='Accessibility Node Provider']"));
        nodeProviderElement.click();

        Thread.sleep(200);

        driver.navigate().back();

        Thread.sleep(200);

        AndroidElement nodeQueryingElement = (AndroidElement) driver.findElement(By.xpath("//android.widget.TextView[@content-desc='Accessibility Node Querying']"));
        nodeQueryingElement.click();
        Thread.sleep(200);

        driver.navigate().back();
        Thread.sleep(200);

        nodeQueryingElement.click();
        Thread.sleep(300);

        AndroidElement checkBox = (AndroidElement) driver.findElement(By.xpath("//android.widget.LinearLayout[@index='0']/android.widget.CheckBox[@index='1']"));
        checkBox.click();

        Thread.sleep(100);

        AndroidElement goLaunchedBox = (AndroidElement) driver.findElement(By.xpath("//android.widget.LinearLayout[@index='1']/android.widget.CheckBox[@index='1']"));
        goLaunchedBox.click();

        Thread.sleep(100);

        AndroidElement conquerWorldCheckBox = (AndroidElement) driver.findElement(By.xpath("//android.widget.LinearLayout[@index='2']/android.widget.CheckBox[@index='1']"));
        conquerWorldCheckBox.click();
        conquerWorldCheckBox.click();
        Thread.sleep(100);
        driver.navigate().back();


        driver.close();
//        Thread.sleep(200);

//        nodeQueryingElement.click();
//        Thread.sleep(200);

//        checkBox.click();
//        Thread.sleep(100);
//
//        goLaunchedBox.click();
//        Thread.sleep(100);

        conquerWorldCheckBox.click();

        driver.closeApp();


    }
}
