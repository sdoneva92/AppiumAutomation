package startPage;

import base.BaseTest;
import factories.AccessibilityPageFactory;
import factories.AnimationPageFactory;
import factories.StartPageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.APIDemoStartPage;

import static constants.Constants.DIRECTION_NAME_DOWN;

public class APIDemoStartPageTest extends BaseTest {

    private AccessibilityPageFactory accessibilityPageFactory;
    private AnimationPageFactory animationPageFactory;

    @BeforeMethod
    public void init() {
        apiDemoStartPage = new APIDemoStartPage();
        apiDemoStartPage.setDriver(androidDriver);

        startPageFactory = new StartPageFactory();
        startPageFactory.clickOnContinueElement(androidDriver);

        startPageFactory.sleepTheThread(600);

        startPageFactory.clickOkButton(androidDriver);
    }

    @Test
    public void verifyThatAllElementsOnTheStartPageAreWorking() {

        startPageFactory.clickAccessibilityButton(androidDriver);
        startPageFactory.navigateBack(androidDriver);
        startPageFactory.clickOnAnimationButton(androidDriver);
        startPageFactory.navigateBack(androidDriver);
        startPageFactory.clickAppElement(androidDriver);
        startPageFactory.navigateBack(androidDriver);
        startPageFactory.clickContentElement(androidDriver);
        startPageFactory.navigateBack(androidDriver);
        startPageFactory.clickGraphicsElement(androidDriver);
        startPageFactory.navigateBack(androidDriver);
        startPageFactory.clickMediaElement(androidDriver);
        startPageFactory.navigateBack(androidDriver);
        startPageFactory.clickNfcElement(androidDriver);
        startPageFactory.navigateBack(androidDriver);
        startPageFactory.clickOsElement(androidDriver);
        startPageFactory.navigateBack(androidDriver);
        startPageFactory.clickPreferencesElement(androidDriver);
        startPageFactory.navigateBack(androidDriver);
        startPageFactory.scroll(DIRECTION_NAME_DOWN, 1, androidDriver);
        startPageFactory.clickTextElement(androidDriver);
        startPageFactory.navigateBack(androidDriver);
        startPageFactory.clickViewsElement(androidDriver);
        startPageFactory.navigateBack(androidDriver);
        startPageFactory.closeApp(androidDriver);
    }

    @Test()
    public void clickOnAccessibilityButtonAndGoToAccessibilityPage() {

        /*
        Prerequisite to enter the accessibility page is to go from the start page, clicking on the accessibility button
         */

        startPageFactory.clickAccessibilityButton(androidDriver);

        //Click on the Node Provider element in the accessibility page
        accessibilityPageFactory = new AccessibilityPageFactory();
        accessibilityPageFactory.clickAccessibilityNodeProviderButton(androidDriver);
        accessibilityPageFactory.navigateBack(androidDriver);

        //Click on node querying provider element in the accessibility page
        accessibilityPageFactory.clickAccessibilityNodeQueryingButton(androidDriver);
        accessibilityPageFactory.navigateBack(androidDriver);

        //Click on the accessibilityService element in the accessibility page
        accessibilityPageFactory.clickAccessibilityServiceButton(androidDriver);
        accessibilityPageFactory.navigateBack(androidDriver);

        //Click on the customView element in the accessibility page
        accessibilityPageFactory.clickCustomViewButton(androidDriver);
        accessibilityPageFactory.navigateBack(androidDriver);

        //close the app
        accessibilityPageFactory.closeApp(androidDriver);
    }

    @Test
    public void clickOnAnimationButtonAndEnterTheAnimationsPageAndVerifyAllElements() {

        /*
        Prerequisite to enter the animation page is to go from the start page, clicking on the animation button
         */
        startPageFactory.clickOnAnimationButton(androidDriver);

        //initialize the animation page factory object
        animationPageFactory = new AnimationPageFactory();

        //Click on the bouncing balls element in the animation page
        animationPageFactory.clickOnBouncingBallsButton(androidDriver);
        animationPageFactory.navigateBack(androidDriver);

        //Click on the cloning element
        animationPageFactory.clickOnCloningButton(androidDriver);
        animationPageFactory.navigateBack(androidDriver);

        //Click on customEvalutorElement
        animationPageFactory.clickOnCustomEvaluatorButton(androidDriver);
        animationPageFactory.navigateBack(androidDriver);

        //click on defaultLayoutAnimationsElement
        animationPageFactory.clickOnDefaultLayoutAnimationsButton(androidDriver);
        animationPageFactory.navigateBack(androidDriver);

        //click on events element
        animationPageFactory.clickOnEventsElement(androidDriver);
        animationPageFactory.navigateBack(androidDriver);

        //click on Hide-Show Animation element
        animationPageFactory.clickOnHideShowAnimationElement(androidDriver);
        animationPageFactory.navigateBack(androidDriver);

        /*
        TODO FINISH THE TEST CASE FOR THE ELEMENTS, INCLUDING SCROLLING ALSO INCLUDE ASSERTS
         */

        animationPageFactory.closeApp(androidDriver);

    }
}
