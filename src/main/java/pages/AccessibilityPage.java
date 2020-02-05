package pages;

import org.openqa.selenium.By;

public class AccessibilityPage extends BasePage {

    private By accessibilityNodeProviderElement = By.xpath("//android.widget.TextView[@content-desc='Accessibility Node Provider']");

    private By accessibilityNodeQueryingElement = By.xpath("//android.widget.TextView[@content-desc='Accessibility Node Querying']");

    private By accessibilityServiceElement = By.xpath("//android.widget.TextView[@content-desc='Accessibility Service']");

    private By customViewElement = By.xpath("//android.widget.TextView[@content-desc='Custom View']");

    public By getAccessibilityNodeProviderElement() {
        return accessibilityNodeProviderElement;
    }

    public By getAccessibilityNodeQueryingElement() {
        return accessibilityNodeQueryingElement;
    }

    public By getAccessibilityServiceElement() {
        return accessibilityServiceElement;
    }

    public By getCustomViewElement() {
        return customViewElement;
    }
}
