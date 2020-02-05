package startPage;

import base.BaseTest;
import factories.StartPageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.APIDemoStartPage;

import static constants.Constants.DIRECTION_NAME_DOWN;

public class APIDemoStartPageTest extends BaseTest {

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
        androidDriver.closeApp();
    }

    //    @Test()
    public void clickOnAnimationButton() {

    }
}
