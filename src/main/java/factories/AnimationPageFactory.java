package factories;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import pages.AnimationPage;

public class AnimationPageFactory extends BaseFactory {

    private AnimationPage animationPage;

    public AnimationPageFactory() {

        animationPage = new AnimationPage();
    }

    public void clickOnBouncingBallsButton(AndroidDriver androidDriver) {

        By bouncingBallsButton = animationPage.getBouncingBallsElement();
        androidDriver.findElement(bouncingBallsButton).click();
    }

    public void clickOnCloningButton(AndroidDriver androidDriver) {

        By cloningButton = animationPage.getCloningElement();
        androidDriver.findElement(cloningButton).click();
    }

    public void clickOnCustomEvaluatorButton(AndroidDriver androidDriver) {

        By customEvaluatorButton = animationPage.getCustomEvaluatorElement();
        androidDriver.findElement(customEvaluatorButton).click();
    }

    public void clickOnDefaultLayoutAnimationsButton(AndroidDriver androidDriver) {

        By defaultLayoutAnimationsElement = animationPage.getDefaultLayoutAnimationsElement();
        androidDriver.findElement(defaultLayoutAnimationsElement).click();
    }

    public void clickOnEventsElement(AndroidDriver androidDriver) {

        By eventsElement = animationPage.getEventsElement();
        androidDriver.findElement(eventsElement).click();
    }

    public void clickOnHideShowAnimationElement(AndroidDriver androidDriver) {

        By hideShowAnimationElement = animationPage.getHideShowAnimationElement();
        androidDriver.findElement(hideShowAnimationElement).click();
    }

    public void clickOnLayoutAnimationsElement(AndroidDriver androidDriver) {

        By layoutAnimationsElement = animationPage.getLayoutAnimationsElement();
        androidDriver.findElement(layoutAnimationsElement).click();
    }

    public void clickOnLoadingElement(AndroidDriver androidDriver) {

        By loadingElement = animationPage.getLoadingElement();
        androidDriver.findElement(loadingElement).click();
    }

    public void clickOnMultiplePropertiesElement(AndroidDriver androidDriver) {

        By multiplePropertiesElement = animationPage.getMultiplePropertiesElement();
        androidDriver.findElement(multiplePropertiesElement).click();
    }

    public void clickOnReversingElement(AndroidDriver androidDriver) {

        By reversingElement = animationPage.getReversingElement();
        androidDriver.findElement(reversingElement).click();
    }

    public void clickOnSeekingEmelent(AndroidDriver androidDriver) {

        By seekingElement = animationPage.getSeekingElement();
        androidDriver.findElement(seekingElement).click();
    }

    public void clickOnViewFlipElement(AndroidDriver androidDriver) {

        By viewFlipElement = animationPage.getViewFlipElement();
        androidDriver.findElement(viewFlipElement).click();
    }
}
