package steps;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.LoginPage;

public class LoginPageSteps {
    LoginPage loginPage;
    public LoginPageSteps(WebDriverWait wait){
        loginPage=new LoginPage(wait);
    }

    public LoginPageSteps clickChangeLanguage(){
        loginPage.chooseLanguage.click();
        return this;
    }
}
