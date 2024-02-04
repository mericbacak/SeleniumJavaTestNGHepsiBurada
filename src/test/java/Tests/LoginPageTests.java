package Tests;

import base.BaseTest;
import io.qameta.allure.Description;
import org.testng.annotations.Test;
import Pages.LoginPage;

public class LoginPageTests extends BaseTest {

    @Test(priority = 1)
    @Description("Open hepsiburada main page and click login button and do do login page assertions"
    )
    public void LoginPageLoginLisBoxTests() {
        LoginPage loginPage= new LoginPage(driver);
        loginPage.LoginandRegisterValidations("Üye Giriş Sayfası & Üye Ol - Hepsiburada");
    }
}