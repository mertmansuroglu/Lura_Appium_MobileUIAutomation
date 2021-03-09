package pageobjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class OnDemandSection {
    public OnDemandSection(AppiumDriver driver) {

        //compatibility for ios android platforms thats why we put appiumfiledecotar
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);

    }

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"tr.com.alyo.luratv:id/btn_back\")")
    public RemoteWebElement BackButtonOfApp;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"tr.com.alyo.luratv:id/action_vod\")")
    public RemoteWebElement OnDemandButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"tr.com.alyo.luratv:id/txt_label_continue_watching\")")
    public RemoteWebElement ContinueWatchLabel;
    //Movies Section Elements*************
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"tr.com.alyo.luratv:id/btn_watch\")")
    public RemoteWebElement WatchNowButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"tr.com.alyo.luratv:id/btn_watchlist_movies\")")
    public RemoteWebElement AddWatchlistButtonMovies;
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"tr.com.alyo.luratv:id/btn_thumbs_down_movies\")")
    public RemoteWebElement ThumbsDownButtonMovies;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"tr.com.alyo.luratv:id/btn_thumbs_up_movies\")")
    public RemoteWebElement ThumbsUpButtonMovies;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"tr.com.alyo.luratv:id/txt_movie_detail_title\")")
    public RemoteWebElement MovieDetailTitle;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"tr.com.alyo.luratv:id/txt_movie_detail_duration\")")
    public RemoteWebElement MovieDetailDuration;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"tr.com.alyo.luratv:id/img_movie_detail_vertical_poster\")")
    public RemoteWebElement MovieDetailVerticalPoster;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"tr.com.alyo.luratv:id/img_movie_detail_horizontal_poster\")")
    public RemoteWebElement MovieDetailHorizontalPoster;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"tr.com.alyo.luratv:id/txt_header_you_may_like\")")
    public RemoteWebElement YouMayLikeHeader;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"tr.com.alyo.luratv:id/txt_description\")")
    public RemoteWebElement MovieDescriptionText;
    //Series Section Elements***************

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"tr.com.alyo.luratv:id/btn_watchlist_series\")")
    public RemoteWebElement AddWatchlistButtonSeries;
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"tr.com.alyo.luratv:id/btn_thumbs_down_series\")")
    public RemoteWebElement ThumbsDownButtonSeries;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"tr.com.alyo.luratv:id/btn_thumbs_up_series\")")
    public RemoteWebElement ThumbsUpButtonSeries;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"tr.com.alyo.luratv:id/txt_series_detail_title\")")
    public RemoteWebElement SeriesDetailTitle;


    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"tr.com.alyo.luratv:id/img_series_detail_vertical_poster\")")
    public RemoteWebElement SeriesDetailVerticalPoster;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"tr.com.alyo.luratv:id/img_series_detail_horizontal_poster\")")
    public RemoteWebElement SeriesDetailHorizontalPoster;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"tr.com.alyo.luratv:id/txt_description\")")
    public RemoteWebElement SeriesDescriptionText;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"tr.com.alyo.luratv:id/txt_season_name\")")
    public RemoteWebElement SeriesSeasonName;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"tr.com.alyo.luratv:id/txt_episode_title\")")
    public RemoteWebElement EpisodeTitleText;

    //On demand Player
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"tr.com.alyo.luratv:id/btn_mid_layout_vod_info\")")
    public RemoteWebElement InfoButtonOnDemand;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"tr.com.alyo.luratv:id/btn_add_vod_to_watchlist\")")
    public RemoteWebElement AddWatchlistButtonPlayer;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"tr.com.alyo.luratv:id/btn_mid_layout_vod_seek_to_start\")")
    public RemoteWebElement SeekStartButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"tr.com.alyo.luratv:id/tr.com.alyo.luratv:id/txt_mid_layout_vod_title\")")
    public RemoteWebElement VODTitleOnPlayer;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"tr.com.alyo.luratv:id/txt_mid_layout_vod_subtitle\")")
    public RemoteWebElement VODSubTitleOnPlayer;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"tr.com.alyo.luratv:id/img_mid_layout_vod_poster\")")
    public RemoteWebElement VODPosterOnPlayer;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"tr.com.alyo.luratv:id/exo_position\")")
    public RemoteWebElement ScrubberVOd;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"tr.com.alyo.luratv:id/exo_duration\")")
    public RemoteWebElement DurationVOd;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"tr.com.alyo.luratv:id/exo_progress\")")
    public RemoteWebElement ProgressPlayerVOD;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"tr.com.alyo.luratv:id/exoplayer_player_view\")")
    public RemoteWebElement OpenPlayerControlsVOD;T


    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"tr.com.alyo.luratv:id/relative_layout_video_loader\")")
    public RemoteWebElement LayoutForHide;


    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"tr.com.alyo.luratv:id/btn_pause_vod\")")
    public RemoteWebElement PausePlayer;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"tr.com.alyo.luratv:id/btn_play_vod\")")
    public RemoteWebElement PlayPlayer;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"tr.com.alyo.luratv:id/btn_fullscreen_vod\")")
    public RemoteWebElement FullscreenButtonVOD;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"tr.com.alyo.luratv:id/btn_mute_unmute\")")
    public RemoteWebElement MUTE_UNMUTE;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"tr.com.alyo.luratv:id/btn_cc\")")
    public RemoteWebElement CC_bttn;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"tr.com.alyo.luratv:id/media_route_button\")")
    public RemoteWebElement Cast_bttn;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"tr.com.alyo.luratv:id/btn_rewind\")")
    public RemoteWebElement RewindButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"tr.com.alyo.luratv:id/btn_ffwd\")")
    public RemoteWebElement ForwardButton;


}


