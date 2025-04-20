package steps;

import io.appium.java_client.android.AndroidDriver;
import pages.LoginPage;


public class LoginPageSteps {

    public LoginPage loginPage;
    public LoginPageSteps(AndroidDriver driver){
        loginPage=new LoginPage(driver);
    }

    public LoginPageSteps fillUserName(String userName){
        loginPage.userNameInput.sendKeys(userName);
        return this;
    }
    public LoginPageSteps fillPasswordField(String password){
        loginPage.passwordInput.sendKeys(password);
        return this;
    }
    public String getUserNameErrorText(){
        return loginPage.usernameErrorText.getText();
    }
    public String getPasswordErrorText(){
        return loginPage.passwordErrorText.getText();
    }
    public String getFlashMessageText(){
        return loginPage.flashmessageText.getText();
    }

    public LoginPageSteps clickLoginButton(){
        loginPage.LoginButton.click();
        return this;
    }

    public LoginPageSteps clickIntoLoginField(){
        loginPage.userNameInput.click();
        return this;
    }

    public LoginPageSteps clickIntoPasswordField(){
        loginPage.passwordInput.click();
        return this;
    }

    public LoginPageSteps clickChangeLanguage(){
        loginPage.changeLanguageBtn.click();
        return this;
    }

    public LoginPageSteps chooseLanguage(String language){
        switch (language){
            case "EN" -> {
                loginPage.enLanguageButton.click();
                loginPage.closeChooseLanguagePageButton.click();
            }
            case "KA" -> {
                loginPage.kaLanguageButton.click();
                loginPage.closeChooseLanguagePageButton.click();
            }
            case "RU" -> {
                loginPage.ruLanguageButton.click();
                loginPage.closeChooseLanguagePageButton.click();
            }
        }

        return this;
    }
}
