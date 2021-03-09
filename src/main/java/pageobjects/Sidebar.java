package pageobjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.PageFactory;

public class Sidebar {
    public Sidebar(AppiumDriver driver) {

        //compatibility for ios android platforms thats why we put appiumfiledecotar
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(uiAutomator = "resourceId(\"tr.com.alyo.luratv:id/cv_categories\").childSelector(text(\"Sports\"))")
    public RemoteWebElement Sports_Category;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"tr.com.alyo.luratv:id/btn_open_drawer\")")
    public RemoteWebElement SidebarButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"tr.com.alyo.luratv:id/layout_account_nav\")")
    public RemoteWebElement MyAccountButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"tr.com.alyo.luratv:id/right_menu_about\")")
    public RemoteWebElement AboutButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"tr.com.alyo.luratv:id/right_menu_privacy_policy\")")
    public RemoteWebElement PrivacyButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"tr.com.alyo.luratv:id/right_menu_terms_of_service\")")
    public RemoteWebElement TermsOfServiceButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"WATCH\")")
    public RemoteWebElement WatchLabel;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"COMPANY\")")
    public RemoteWebElement CompanyLabel;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"@2020 ALYO2\")")
    public RemoteWebElement AlyoLabel;

}
//@AndroidFindBy(xpath="//android.widget.Button[@text='CUSTOMER JOURNEY SAMPLE']")
//@AndroidFindBy(uiAutomator = "new UiSelector().text(\"DOCUMENT SCANNER SAMPLE\")")



