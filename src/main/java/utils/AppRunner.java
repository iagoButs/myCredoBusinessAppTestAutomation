package utils;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeSuite;
import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class AppRunner {
     public AndroidDriver driver;

    @BeforeSuite
    public void setupCapabilities() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("appium:automationName", "UIAutomator2");
        caps.setCapability("appium:deviceName", "Pixel");
        caps.setCapability("appium:avd", "Pixel");
        caps.setCapability("appium:appPackage", "com.credobusiness");
        caps.setCapability("appium:appActivity", "com.credobusiness.MainActivity");
        caps.setCapability("appium:autoGrantPermissions", true);
        caps.setCapability("appium:noReset", true);
        caps.setCapability("appium:disableIdLocatorAutocompletion", true);
        caps.setCapability("appium:fullReset", false);
        caps.setCapability("appium:ensureWebviewsHavePages", true);
        caps.setCapability("appium:enableMultiWindows", true);
        caps.setCapability("appium:uiautomator2ServerInstallTimeout", 30000);
        caps.setCapability("appium:adbExecTimeout", 20000);
        caps.setCapability("appium:newCommandTimeout", 300);
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), caps);
    }

    }


