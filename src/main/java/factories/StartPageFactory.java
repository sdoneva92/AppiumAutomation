package factories;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import pages.APIDemoStartPage;

public class StartPageFactory extends BaseFactory{

    private APIDemoStartPage apiDemoStartPage;

    public StartPageFactory() {
        apiDemoStartPage = new APIDemoStartPage();
    }

    public void clickOnContinueElement(AndroidDriver androidDriver) {

        By continueButton = apiDemoStartPage.getContinueElement();
        androidDriver.findElement(continueButton).click();
    }

    public void clickOkButton(AndroidDriver androidDriver) {

        By okButton = apiDemoStartPage.getOkButton();
        androidDriver.findElement(okButton).click();
    }

    public void clickAccessibilityButton(AndroidDriver androidDriver) {

        By accessibilityButton = apiDemoStartPage.getAccessibilityButton();
        androidDriver.findElement(accessibilityButton).click();
    }

    public void clickAccessibilityNodeProviderElement(AndroidDriver androidDriver) {

        By accessibilityNodeProvideElement = apiDemoStartPage.getAccessibilityNodeProviderElement();
        androidDriver.findElement(accessibilityNodeProvideElement).click();
    }

    public void clickAppElement(AndroidDriver androidDriver) {

        By appElement = apiDemoStartPage.getAppElement();
        androidDriver.findElement(appElement).click();

    }

    public void clickContentElement(AndroidDriver androidDriver) {
        By contentElement = apiDemoStartPage.getContentElement();
        androidDriver.findElement(contentElement).click();
    }

    public void clickGraphicsElement(AndroidDriver androidDriver) {
        By graphicsElement = apiDemoStartPage.getGraphicsElement();
        androidDriver.findElement(graphicsElement).click();
    }

    public void clickMediaElement(AndroidDriver androidDriver) {
        By mediaElement = apiDemoStartPage.getMediaElement();
        androidDriver.findElement(mediaElement).click();
    }

    public void clickNfcElement(AndroidDriver androidDriver) {
        By nfcElement = apiDemoStartPage.getNfcElement();
        androidDriver.findElement(nfcElement).click();
    }

    public void clickOsElement(AndroidDriver androidDriver) {
        By osElement = apiDemoStartPage.getOsElement();
        androidDriver.findElement(osElement).click();
    }

    public void clickPreferencesElement(AndroidDriver androidDriver) {
        By preferencesElement = apiDemoStartPage.getPreferencesElement();
        androidDriver.findElement(preferencesElement).click();
    }

    public void clickTextElement(AndroidDriver androidDriver) {
        By textElement = apiDemoStartPage.getTextElement();
        androidDriver.findElement(textElement).click();
    }

    public void clickViewsElement(AndroidDriver androidDriver) {
        By viewsElement = apiDemoStartPage.getViewsElement();
        androidDriver.findElement(viewsElement).click();
    }

    public void clickOnAnimationButton(AndroidDriver driver){
        By animationElement = apiDemoStartPage.getAnimationButton();
        driver.findElement(animationElement).click();
    }
}
