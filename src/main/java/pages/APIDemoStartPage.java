package pages;

import org.openqa.selenium.By;

public class APIDemoStartPage extends BasePage {

    private By continueElement = By.id("com.android.permissioncontroller:id/continue_button");

    private By okButton = By.id("android:id/button1");

    private By accessibilityButton = By.xpath("//android.widget.TextView[@content-desc='Accessibility']");

    private By animationButton = By.xpath("//android.widget.TextView[@content-desc='Animation']");

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

    public By getContinueElement() {
        return continueElement;
    }

    public By getOkButton() {
        return okButton;
    }

    public By getAccessibilityButton() {
        return accessibilityButton;
    }

    public By getAccessibilityNodeProviderElement() {
        return accessibilityNodeProviderElement;
    }

    public By getAppElement() {
        return appElement;
    }

    public By getContentElement() {
        return contentElement;
    }

    public By getGraphicsElement() {
        return graphicsElement;
    }

    public By getMediaElement() {
        return mediaElement;
    }

    public By getNfcElement() {
        return nfcElement;
    }

    public By getOsElement() {
        return osElement;
    }

    public By getPreferencesElement() {
        return preferencesElement;
    }

    public By getTextElement() {
        return textElement;
    }

    public By getViewsElement() {
        return viewsElement;
    }

    public By getAnimationButton() {
        return animationButton;
    }
}

