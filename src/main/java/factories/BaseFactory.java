package factories;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import pages.BasePage;

import java.time.Duration;

import static constants.Constants.DIRECTION_NAME_DOWN;

public class BaseFactory extends BasePage {

    public void navigateBack(AndroidDriver driver) {
        driver.navigate().back();
    }

    public void navigateForward(AndroidDriver driver) {

        driver.navigate().forward();
    }

    public void swipe(AndroidDriver driver) {
        driver.closeApp();
    }

    public void scroll(String direction, int times, AndroidDriver driver) {

        if (direction.equals(DIRECTION_NAME_DOWN)) {
            Dimension dimension = driver.manage().window().getSize();
            int width = dimension.getWidth() / 2;
            for (int i = 0; i < times; i++) {
                int startY = (int) (dimension.getHeight() * 0.7);
                int endY = (int) (dimension.getHeight() * 0.5);
                new TouchAction(driver).press(PointOption.point(width, startY)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(width, endY)).release().perform();
            }
        } else {
            Dimension dimension = driver.manage().window().getSize();
            int width = dimension.getWidth() / 2;
            for (int i = 0; i < times; i++) {
                int startY = (int) (dimension.getHeight() * 0.7);
                int endY = (int) (dimension.getHeight() * 0.5);
                new TouchAction(driver).press(PointOption.point(width, endY)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(width, startY)).release().perform();
            }
        }
    }

    public void sleepTheThread(long milisec) {

        try {
            Thread.sleep(milisec);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
