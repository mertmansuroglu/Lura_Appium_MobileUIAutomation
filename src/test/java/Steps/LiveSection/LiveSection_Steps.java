package Steps.LiveSection;

import appiumFramework.Base;
import appiumFramework.Utilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobjects.LiveSection;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import pageobjects.OnDemandSection;
import pageobjects.Sidebar;

import java.time.Duration;
import java.util.Collection;

import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

public class LiveSection_Steps extends Base{
    @Given("I open the application")
    public void iOpenTheApplication() throws Exception {

        AndroidDriver<AndroidElement> driver= capabilities();
//       Runtime.getRuntime().exec("taskkill /F /IM node.exe");
        service = startServer();
        LiveSection ls = new LiveSection(driver);;
        OnDemandSection dm= new OnDemandSection(driver);
        Utilities ut= new Utilities(driver);
        Assert.assertTrue(ls.OpenPlayerControls.isDisplayed());
//
        //Test case 1****
        ut.ChannelSelector(1);
        ls.OpenPlayerControls.click();
        ls.OpenPlayerControls.click();
        ls.FullscreenPlayer.click();
        ls.FavoriteButton.click();
        ls.FullscreenPlayer.click();
        new WebDriverWait(driver, 25).pollingEvery(Duration.ofMillis(1000)).ignoring(NoSuchElementException.class).ignoring(TimeoutException.class).
          until(ExpectedConditions.visibilityOf(ls.Favorites_Category));
        //Test case 2****
        dm.OnDemandButton.click();
        ut.SerieSelector().get(0).click();
        ut.SeriesEpisodeSelector(0);
        dm.OpenPlayerControlsVOD.click();
        dm.OpenPlayerControlsVOD.click();
        dm.OpenPlayerControlsVOD.click();
        dm.AddWatchlistButtonPlayer.click();
        ut.BackButton();
        ut.BackButton();
        new WebDriverWait(driver, 25).pollingEvery(Duration.ofMillis(1000)).ignoring(NoSuchElementException.class).ignoring(TimeoutException.class).
                until(ExpectedConditions.visibilityOf(dm.ContinueWatchLabel));

        //Test case 3****
        dm.OnDemandButton.click();
        ut.MovieSelector().get(1).click();
        dm.WatchNowButton.click();
        dm.OpenPlayerControlsVOD.click();
        dm.OpenPlayerControlsVOD.click();
        dm.OpenPlayerControlsVOD.click();
        dm.AddWatchlistButtonPlayer.click();
        ut.BackButton();
        ut.BackButton();
        new WebDriverWait(driver, 25).pollingEvery(Duration.ofMillis(1000)).ignoring(NoSuchElementException.class).ignoring(TimeoutException.class).
                until(ExpectedConditions.visibilityOf(dm.ContinueWatchLabel));

        //Test case 4****
        dm.OnDemandButton.click();
        ut.MovieSelector().get(2).click();
        dm.WatchNowButton.click();
        dm.OpenPlayerControlsVOD.click();
        dm.OpenPlayerControlsVOD.click();
        dm.OpenPlayerControlsVOD.click();
        dm.OpenPlayerControlsVOD.click();
        dm.CC_bttn.click();
        new WebDriverWait(driver, 25).pollingEvery(Duration.ofMillis(1000)).ignoring(NoSuchElementException.class).ignoring(TimeoutException.class).
                until(ExpectedConditions.visibilityOf(dm.CC_bttn));

    }

}


