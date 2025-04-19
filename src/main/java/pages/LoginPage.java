package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.DriverManager;
import java.time.Duration;

public class LoginPage {
    public WebElement chooseLanguage;

    public LoginPage(WebDriverWait wait){
        chooseLanguage=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.ViewGroup[@resource-id='changeLanguageButton']")));

    }
}
