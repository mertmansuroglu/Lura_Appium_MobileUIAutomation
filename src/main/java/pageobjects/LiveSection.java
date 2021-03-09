package pageobjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.PageFactory;

public class LiveSection {
    public LiveSection(AppiumDriver driver) {

        //compatibility for ios android platforms thats why we put appiumfiledecotar
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);

    }

    @AndroidFindBy(uiAutomator = "resourceId(\"tr.com.alyo.luratv:id/cv_categories\").childSelector(text(\"Sports\"))")
    public RemoteWebElement Sports_Category;


    @AndroidFindBy(uiAutomator = "resourceId(\"tr.com.alyo.luratv:id/cv_categories\").childSelector(text(\"Life & Style\"))")
    public RemoteWebElement Life_Category;

    @AndroidFindBy(uiAutomator = "resourceId(\"tr.com.alyo.luratv:id/cv_categories\").childSelector(text(\"Entertainment\"))")
    public RemoteWebElement Entertainment_Category;

    @AndroidFindBy(uiAutomator = "resourceId(\"tr.com.alyo.luratv:id/cv_categories\").childSelector(text(\"Favorites\"))")
    public RemoteWebElement Favorites_Category;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"tr.com.alyo.luratv:id/btn_open_drawer\")")
    public RemoteWebElement SidebarButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"tr.com.alyo.luratv:id/exo_subtitles\")")
    public RemoteWebElement OpenPlayerControls;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"tr.com.alyo.luratv:id/exo_pause\")")
    public RemoteWebElement PausePlayer;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"tr.com.alyo.luratv:id/exo_play\")")
    public RemoteWebElement PlayPlayer;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"tr.com.alyo.luratv:id/btn_mute_unmute\")")
    public RemoteWebElement MUTE_UNMUTE;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"tr.com.alyo.luratv:id/btn_cc\")")
    public RemoteWebElement CC_bttn;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"tr.com.alyo.luratv:id/media_route_button\")")
    public RemoteWebElement Cast_bttn;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"tr.com.alyo.luratv:id/btn_open_pip\")")
    public RemoteWebElement OpenPip;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"tr.com.alyo.luratv:id/btn_pip_close\")")
    public RemoteWebElement ClosePip;
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"tr.com.alyo.luratv:id/txt_pip_title\")")
    public RemoteWebElement PipTitle;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"tr.com.alyo.luratv:id/txt_pip_subtitle\")")
    public RemoteWebElement PipSubTitle;


    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"tr.com.alyo.luratv:id/btn_fullscreen\")")
    public RemoteWebElement FullscreenPlayer;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"tr.com.alyo.luratv:id/btn_event_info\")")
    public RemoteWebElement InfoButtonPlayer;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"tr.com.alyo.luratv:id/txt_controller_event_name\")")
    public RemoteWebElement EventNamePlayer;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"tr.com.alyo.luratv:id/txt_controller_event_start\")")
    public RemoteWebElement StartEventTimePlayer;


    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"tr.com.alyo.luratv:id/progress_bar_event_duration\")")
    public RemoteWebElement ProgressBarPlayer;


    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"tr.com.alyo.luratv:id/txt_controller_event_end\")")
    public RemoteWebElement EndEventTimePlayer;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"tr.com.alyo.luratv:id/img_app_bar_logo\")")
    public RemoteWebElement LuraIcon;

    @AndroidFindBy(uiAutomator = "resourceId(\"tr.com.alyo.luratv:id/rv_channels\").childSelector(text(\"360\"))")
    public RemoteWebElement LivechannelButton_Univision;

    @AndroidFindBy(uiAutomator = "resourceId(\"tr.com.alyo.luratv:id/rv_channels\").childSelector(text(\"345\"))")
    public RemoteWebElement LivechannelButton_Unimas;

    @AndroidFindBy(uiAutomator = "resourceId(\"tr.com.alyo.luratv:id/rv_channels\").childSelector(text(\"8\"))")
    public RemoteWebElement LivechannelButton_TUDN;

    //@AndroidFindBy(xpath="android.widget.FrameLayout[@content-desc="Show player controls"]")
    @AndroidFindBy(uiAutomator = "resourceId(\"tr.com.alyo.luratv:id/rv_channels\").childSelector(text(\"78\"))")
    public RemoteWebElement LivechannelButton_Galavision;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"tr.com.alyo.luratv:id/btn_channel_favorite\")")
    public RemoteWebElement FavoriteButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"tr.com.alyo.luratv:id/btn_playback_controls_channel_down\")")
    public RemoteWebElement NavigateChannelDown;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"tr.com.alyo.luratv:id/btn_playback_controls_channel_up\")")
    public RemoteWebElement NavigateChannelUp;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"tr.com.alyo.luratv:id/btn_mid_layout_live_info\")")
    public RemoteWebElement FullscreenLiveInfo;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"tr.com.alyo.luratv:id/txt_mid_layout_live_title\")")
    public RemoteWebElement FullscreenLiveTitle;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"tr.com.alyo.luratv:id/txt_mid_layout_live_subtitle\")")
    public RemoteWebElement FullscreenLiveChannelNumber;


}

//android.widget.FrameLayout[@content-desc="Show player controls"]

