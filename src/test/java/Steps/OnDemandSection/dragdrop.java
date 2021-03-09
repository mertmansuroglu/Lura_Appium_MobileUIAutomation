package Steps.OnDemandSection;

import appiumFramework.Base;
import appiumFramework.Utilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobjects.LiveSection;
import pageobjects.OnDemandSection;

import javax.lang.model.element.Element;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static appiumFramework.Utilities.DoubleTappingFunction;
import static appiumFramework.Utilities.LongTappingFunction;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

public class dragdrop extends Base{

        @Given("I open the applicationn")
        public void iOpenTheApplicationn() throws Exception {
            AndroidDriver<AndroidElement> driver = capabilities();
            Runtime.getRuntime().exec("taskkill /F /IM node.exe");
            service = startServer();
            OnDemandSection dm = new OnDemandSection(driver);
            Utilities ut = new Utilities(driver);
            LiveSection ls = new LiveSection(driver);
            dm.OnDemandButton.click();
            ut.MovieSelector().get(1).click();
            dm.WatchNowButton.click();
            Thread.sleep(5000);
            ls.OpenPlayerControls.click();
            //longpress//move/release
            WebElement seekbar=driver.findElement(By.id("tr.com.alyo.luratv:id/exo_progress"));
//            WebElement seekbarCurrent= driver.findElement(By.id("tr.com.alyo.luratv:id/exo_progress"));
            //get x diyincede starting point of the seekbar
            int start=seekbar.getLocation().getX();
            //getwidth diyince uzunlugunu aliriz
            int end=seekbar.getSize().getWidth();
            int y=seekbar.getLocation().getY();
//            Move it 40%
            TouchAction action=new TouchAction(driver);
            int moveTo=(int)(end*0.4);
            int moveTo2=(int)(end*0.8);
            action.press(PointOption.point(start,y)).moveTo(PointOption.point(moveTo,y)).release().perform();
            Thread.sleep(4000);
            ls.OpenPlayerControls.click();
//            int current= seekbar.getLocation().getX();
            action.press(PointOption.point(moveTo,y)).moveTo(PointOption.point(moveTo2, y)).release().perform();
            Thread.sleep(4000);
            ls.OpenPlayerControls.click();
            dm.PlayPlayer.click();

        }
        }












//                        }

//            while(true){
//                try {
//                    dm.OpenPlayerControlsVOD.click();
//                    if (dm.MUTE_UNMUTE.isEnabled()){
//                        break;
//                    }
//                        else{dm.OpenPlayerControlsVOD.click();}
//                   }
//                catch (Exception e){}
//            }
//            dm.MUTE_UNMUTE.click();
//touch yaptirirken kontrol ettir sonra donguyu kir
//            if soyleyse break yap









