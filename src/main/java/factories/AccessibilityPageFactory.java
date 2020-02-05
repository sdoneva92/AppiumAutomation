package factories;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import pages.AccessibilityPage;

public class AccessibilityPageFactory extends BaseFactory {

    private AccessibilityPage accessibilityPage;

    public AccessibilityPageFactory() {

        accessibilityPage = new AccessibilityPage();
    }

    public void clickAccessibilityNodeProviderButton(AndroidDriver androidDriver) {

        By accessibilityNodeProviderElement = accessibilityPage.getAccessibilityNodeProviderElement();
        androidDriver.findElement(accessibilityNodeProviderElement).click();
    }

    public void clickAccessibilityNodeQueryingButton(AndroidDriver androidDriver) {

        By accessibilityNodeQueryingElement = accessibilityPage.getAccessibilityNodeQueryingElement();
        androidDriver.findElement(accessibilityNodeQueryingElement).click();
    }

    public void clickAccessibilityServiceButton(AndroidDriver androidDriver) {

        By accessibilityServiceElement = accessibilityPage.getAccessibilityServiceElement();
        androidDriver.findElement(accessibilityServiceElement).click();
    }

    public void clickCustomViewButton(AndroidDriver androidDriver) {

        By customViewElement = accessibilityPage.getCustomViewElement();
        androidDriver.findElement(customViewElement).click();
    }
}
