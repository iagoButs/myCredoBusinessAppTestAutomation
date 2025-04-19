package utils;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.*;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;

public class AppRunner {
     public  AndroidDriver driver;
     public WebDriverWait wait;

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
        wait=new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    }


