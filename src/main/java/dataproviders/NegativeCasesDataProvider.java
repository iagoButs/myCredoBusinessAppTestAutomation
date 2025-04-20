package dataproviders;

import org.testng.annotations.DataProvider;

import static testdata.StaticData.*;

public class NegativeCasesDataProvider {

    @DataProvider(name = "loginWithoutPasswordandUserName")
    public Object[][] loginWithoutPasswordandUserName() {
        return new Object[][] {
                {kaLanguage, mandatoryFieldErrorTextKa},
                {enLanguage, mandatoryFieldErrorTextEn},
                {ruLanguage, mandatoryFieldErrorTextRu}
        };
    }

    @DataProvider(name = "authorisationWithOnlyLogin")
    public Object[][] authorisationWithOnlyLogin() {
        return new Object[][] {
                {kaLanguage, testUser, mandatoryFieldErrorTextKa},
                {enLanguage, testUser, mandatoryFieldErrorTextEn},
                {ruLanguage, testUser, mandatoryFieldErrorTextRu}
        };
    }
    @DataProvider(name = "authorisationWithOnlyPassword")
    public Object[][] authorisationWithOnlyPassword() {
        return new Object[][] {
                {kaLanguage, testPassword, mandatoryFieldErrorTextKa},
                {enLanguage, testPassword, mandatoryFieldErrorTextEn},
                {ruLanguage, testPassword, mandatoryFieldErrorTextRu}
        };
    }

    @DataProvider(name = "useWrongSymbolInUserNameField")
    public Object[][] useWrongSymbolInUserNameField() {
        return new Object[][] {
                {kaLanguage, symbols, wrongSymbolsKa},
                {enLanguage, symbols, wrongSymbolsEn},
                {ruLanguage, symbols, wrongSymbolsRu}
        };
    }

    @DataProvider(name = "authorisationWithWrongUserAndPassword")
    public Object[][] authorisationWithWrongUserAndPassword() {
        return new Object[][] {
                {kaLanguage, testUser, testPassword,errorDuringAuthorisationKa},
                {enLanguage, testUser, testPassword,errorDuringAuthorisationEn},
                {ruLanguage, testUser, testPassword, errorDuringAuthorisationRu}
        };
    }

}
