import dataproviders.NegativeCasesDataProvider;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import steps.LoginPageSteps;
import utils.AppRunner;



public class NegativeCases extends AppRunner {
    LoginPageSteps loginPageSteps;


    @BeforeClass
    public void intiialize(){
        loginPageSteps=new LoginPageSteps(driver);
    }


    @Test(dataProvider ="loginWithoutPasswordandUserName", dataProviderClass = NegativeCasesDataProvider.class )
    public void loginWithoutPasswordandUserName(String language,
                                                String checkText){
        loginPageSteps.clickChangeLanguage()
                .chooseLanguage(language)
                .clickLoginButton();
        Assert.assertEquals(loginPageSteps.getUserNameErrorText(), checkText);
        Assert.assertEquals(loginPageSteps.getPasswordErrorText(), checkText);
    }

    @Test(dataProvider = "authorisationWithOnlyLogin", dataProviderClass =NegativeCasesDataProvider.class )
    public void authorisationWithOnlyLoginField(String language,
                                                String username,
                                                String checkText){
        loginPageSteps.clickChangeLanguage()
                .chooseLanguage(language)
                .fillUserName(username)
                .clickIntoPasswordField()
                .clickIntoLoginField();
        Assert.assertEquals(loginPageSteps.getPasswordErrorText(), checkText);
    }

    @Test(dataProvider = "authorisationWithOnlyPassword", dataProviderClass =NegativeCasesDataProvider.class )
    public void authorisationWithOnlyPasswordField(String language,
                                                   String password,
                                                   String checkText){
        loginPageSteps.clickChangeLanguage()
                .chooseLanguage(language)
                .fillPasswordField(password)
                .clickIntoLoginField()
                .clickIntoPasswordField();
        Assert.assertEquals(loginPageSteps.getUserNameErrorText(), checkText);
    }

    @Test(dataProvider = "useWrongSymbolInUserNameField", dataProviderClass =NegativeCasesDataProvider.class )
    public void useWrongSymbolInUserNameField(String language,
                                              String username,
                                              String checkText){
        loginPageSteps.clickChangeLanguage()
                .chooseLanguage(language)
                .fillUserName(username);
        Assert.assertEquals(loginPageSteps.getUserNameErrorText(), checkText);
    }

    @Test(dataProvider = "authorisationWithWrongUserAndPassword", dataProviderClass =NegativeCasesDataProvider.class)
    public void authorisationWithWrongUserAndPassword(String language,
                                                      String username,
                                                      String password,
                                                      String checkText){
        loginPageSteps.clickChangeLanguage()
                .chooseLanguage(language)
                .fillUserName(username)
                .fillPasswordField(password)
                .clickLoginButton();
        Assert.assertEquals(loginPageSteps.getFlashMessageText(), checkText);
    }



}
