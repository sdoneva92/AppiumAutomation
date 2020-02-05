package pages;

import org.openqa.selenium.By;

public class AnimationPage extends BasePage{

    private By bouncingBallsElement = By.xpath("//android.widget.TextView[@content-desc='Bouncing Balls']");

    private By cloningElement = By.xpath("//android.widget.TextView[@content-desc='Cloning']");

    private By customEvaluatorElement = By.xpath("//android.widget.TextView[@content-desc='Custom Evaluator']");

    private By defaultLayoutAnimationsElement = By.xpath("//android.widget.TextView[@content-desc='Default Layout Animations']");

    private By eventsElement = By.xpath("//android.widget.TextView[@content-desc='Events']");

    private By hideShowAnimationElement =By.xpath("//android.widget.TextView[@content-desc='Hide-Show Animations']");

    private By layoutAnimationsElement = By.xpath("//android.widget.TextView[@content-desc='Layout Animations']");

    private By loadingElement = By.xpath("//android.widget.TextView[@content-desc='Loading']");

    private By multiplePropertiesElement = By.xpath("//android.widget.TextView[@content-desc='Multiple Properties']");

    private By reversingElement = By.xpath("//android.widget.TextView[@content-desc='Reversing']");

    private By seekingElement = By.xpath("//android.widget.TextView[@content-desc='Seeking']");

    private By viewFlipElement = By.xpath("//android.widget.TextView[@content-desc='View Flip']");


    public By getBouncingBallsElement() {
        return bouncingBallsElement;
    }

    public By getCloningElement() {
        return cloningElement;
    }

    public By getCustomEvaluatorElement() {
        return customEvaluatorElement;
    }

    public By getDefaultLayoutAnimationsElement() {
        return defaultLayoutAnimationsElement;
    }

    public By getEventsElement() {
        return eventsElement;
    }

    public By getHideShowAnimationElement() {
        return hideShowAnimationElement;
    }

    public By getLayoutAnimationsElement() {
        return layoutAnimationsElement;
    }

    public By getLoadingElement() {
        return loadingElement;
    }

    public By getMultiplePropertiesElement() {
        return multiplePropertiesElement;
    }

    public By getReversingElement() {
        return reversingElement;
    }

    public By getSeekingElement() {
        return seekingElement;
    }

    public By getViewFlipElement() {
        return viewFlipElement;
    }
}
