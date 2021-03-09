package appiumFramework;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Base {

    public static AppiumDriverLocalService service;
    public static AndroidDriver<AndroidElement> driver;


    public AppiumDriverLocalService startServer() {
//help us to start the server
        service = AppiumDriverLocalService.buildDefaultService();
        service.start();
        return service;
    }
    public static AndroidDriver<AndroidElement> capabilities() throws IOException, IOException {
        //TODO Auto-generated method stub
        System.getProperty("user.dir");
        FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\java\\appiumFramework\\Global.properties");
        Properties prop = new Properties();
        prop.load(fis);
        File f = new File("src");
        File fs = new File(f, "app-debug.apk");
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
        cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
//        cap.setCapability("appPackage", "com.idscan.mjcs.sample");
//        cap.setCapability(MobileCapabilityType.FULL_RESET, "False");
//        cap.setCapability(MobileCapabilityType.NO_RESET, "True");
//        cap.setCapability("appActivity", "com.idscan.mjcs.sample.MenuActivity");
        driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        return driver;
    }



}
