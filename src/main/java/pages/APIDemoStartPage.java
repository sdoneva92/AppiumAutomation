package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class APIDemoStartPage {

    private AndroidDriver driver;

    public APIDemoStartPage(AndroidDriver androidDriver) {
        this.driver = androidDriver;
    }

    private By continueElement = By.id("com.android.permissioncontroller:id/continue_button");

    private By okButton = By.id("android:id/button1");

    private By accessibilityButton = By.xpath("//android.widget.TextView[@content-desc='Accessibility']");

    private By accessibilityNodeProviderElement = By.xpath("//android.widget.TextView[@content-desc='Accessibility Node Provider']");

    private By appElement = By.xpath("//android.widget.TextView[@content-desc='App']");

    private By contentElement = By.xpath("//android.widget.TextView[@content-desc='Content']");

    private By graphicsElement = By.xpath("//android.widget.TextView[@content-desc='Graphics']");

    private By mediaElement = By.xpath("//android.widget.TextView[@content-desc='Media']");

    private By nfcElement = By.xpath("//android.widget.TextView[@content-desc='NFC']");

    private By osElement = By.xpath("//android.widget.TextView[@content-desc='OS']");

    private By preferencesElement = By.xpath("//android.widget.TextView[@content-desc='Preference']");

    private By textElement = By.xpath("//android.widget.TextView[@content-desc='Text']");

    private By viewsElement = By.xpath("//android.widget.TextView[@content-desc='Views']");

    public void clickOnContinueButton() {

        driver.findElement(continueElement).click();
    }

    public void clickOkButton() {

        driver.findElement(okButton).click();
    }

    public void clickAccessibilityButton() {

        driver.findElement(accessibilityButton).click();
    }

    public void clickAccessibilityNodeProviderElement() {

        driver.findElement(accessibilityNodeProviderElement).click();
    }

    public void clickAppElement() {

        driver.findElement(appElement).click();

    }

    public void clickContentElement() {

        driver.findElement(contentElement).click();
    }

    public void clickGraphicsElement() {

        driver.findElement(graphicsElement).click();
    }

    public void clickMediaElement(){

        driver.findElement(mediaElement).click();
    }

    public void clickNfcElement(){

        driver.findElement(nfcElement).click();
    }

    public void clickOsElement(){

        driver.findElement(osElement).click();
    }

    public void clickPreferencesElement(){

        driver.findElement(preferencesElement).click();
    }

    public void clickTextElement(){

        driver.findElement(textElement).click();
    }

    public void clickViewsElement(){

        driver.findElement(viewsElement).click();
    }
}

