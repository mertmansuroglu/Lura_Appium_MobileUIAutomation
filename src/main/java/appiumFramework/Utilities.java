package appiumFramework;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.LongPressOptions;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

public class Utilities  extends Base {
//  AndroidDriver<AndroidElement> driver;


    public Utilities(AndroidDriver<AndroidElement> driver) {
        Base.driver = driver;
    }

        public List<MobileElement> MovieSelector() {


            MobileElement MoviesParent  = driver.findElement(By.id("tr.com.alyo.luratv:id/rv_movies"));
            List<MobileElement> movieIndex = MoviesParent.findElements(By.className("android.view.ViewGroup"));
            return movieIndex;

        }
    public List<MobileElement> SerieSelector() {


        MobileElement SeriesParent  = driver.findElement(By.id("tr.com.alyo.luratv:id/rv_series"));
        List<MobileElement> seriesIndex = SeriesParent.findElements(By.className("android.view.ViewGroup"));
        return seriesIndex;

    }
    public List<MobileElement> FavoriteMovieSelector() {


        MobileElement FavoriteMovieParent  = driver.findElement(By.id("tr.com.alyo.luratv:id/rv_favorite_movies"));
        List<MobileElement> favoriteMovieIndex = FavoriteMovieParent.findElements(By.className("android.view.ViewGroup"));
        return favoriteMovieIndex;

    }
    public List<MobileElement> FavoriteSerieSelector() {


        MobileElement FavoriteSerieParent  = driver.findElement(By.id("tr.com.alyo.luratv:id/rv_favorite_series"));
        List<MobileElement> favoriteSerieIndex = FavoriteSerieParent.findElements(By.className("android.view.ViewGroup"));
        return favoriteSerieIndex;

    }
    public List<MobileElement> ContinueWatchSelector() {


        MobileElement ContinueParent  = driver.findElement(By.id("tr.com.alyo.luratv:id/rv_continue_watching"));
        List<MobileElement> continueIndex = ContinueParent.findElements(By.className("android.view.ViewGroup"));
        return continueIndex;

    }
    public List<MobileElement> YouMayLikeSelector() {


        MobileElement YouMayLikeParent  = driver.findElement(By.id("tr.com.alyo.luratv:id/rv_you_may_like"));
        List<MobileElement> YouMayLikeIndex = YouMayLikeParent.findElements(By.className("android.view.ViewGroup"));
        return YouMayLikeIndex;
    }

    public void SeriesEpisodeSelector(int i) {


        MobileElement ContinueParent  = driver.findElement(By.id("tr.com.alyo.luratv:id/rv_episodes"));
        List<MobileElement> continueIndex = ContinueParent.findElements(By.className("android.view.ViewGroup"));
//        System.out.println("dfdfgdfgdfgdffg"+continueIndex.size());
        continueIndex.get(i).findElement(By.id("tr.com.alyo.luratv:id/btn_episode_play")).click();


    }
    public void ChannelSelector(int i) {

        MobileElement ContinueParent  = driver.findElement(By.id("tr.com.alyo.luratv:id/rv_channels"));
        List<MobileElement> continueIndex = ContinueParent.findElements(By.id("tr.com.alyo.luratv:id/rv_main_container"));
        continueIndex.get(i).click();
    }
    public  void BackButton(){
        driver.context("NATIVE_APP");
        driver.pressKey(new KeyEvent(AndroidKey.BACK));

    }
//    public void WaitUntilElementDisplay(WebElement element){
//        new WebDriverWait(driver,30).pollingEvery(Duration.ofMillis(1000)).ignoring(NoSuchElementException.class).ignoring(TimeoutException.class).
//                ignoring(Exception.class).
//                until(ExpectedConditions.visibilityOf(element));
//    }
    public void CleanAppium() throws IOException {
        Runtime.getRuntime().exec("taskkill /F /IM node.exe");

    }

    public void WaitUntilElementDisplay() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("tr.com.alyo.luratv:id/btn_mute_unmute")));
    }


    public boolean checkIfElementIsVisible(WebElement element) {
        try {
            if (new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOf(element)) != null) {
                return true;
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }
    public void scrollToText(String text) {

        WebElement element=  driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"" + text + "\"));");

        new WebDriverWait(driver,30).pollingEvery(Duration.ofMillis(1000)).ignoring(NoSuchElementException.class).ignoring(TimeoutException.class).
                ignoring(Exception.class).
                until(ExpectedConditions.visibilityOf(element));
    }
    public static boolean LongTappingFunction(WebElement element) throws Exception {
        TouchAction action = new TouchAction(driver);
        if (element.isDisplayed()) {
            action.longPress(LongPressOptions.longPressOptions().withElement(element(element)).withDuration(Duration.ofSeconds(6))).perform();
        } else
            throw new Exception("element not found");
        return true;
    }
    public static void DoubleTappingFunction(WebElement element) throws Exception {
        TouchAction action = new TouchAction(driver);
        if (element.isDisplayed()) {
            action.tap(tapOptions().withElement(element(element))).perform();
            action.tap(tapOptions().withElement(element(element))).perform();
        } else
            throw new Exception("element not found");
    }
    public void singleTappingFunction(WebElement element) {
        TouchAction action = new TouchAction(driver);
        action.tap(tapOptions().withElement(element(element))).perform();
    }



    }

