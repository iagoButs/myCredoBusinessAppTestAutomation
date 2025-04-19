import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import steps.LoginPageSteps;
import utils.AppRunner;

public class NegativeCases extends AppRunner {
    LoginPageSteps loginPageSteps;


    @BeforeClass
    public void intiialize(){
        loginPageSteps=new LoginPageSteps(wait);
    }

    @Test
    public void tststs(){
        loginPageSteps.clickChangeLanguage();
    }
}
