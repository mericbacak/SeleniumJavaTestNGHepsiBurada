package Pages;

import org.openqa.selenium.WebDriver;

public class LoginPage extends Page{
    public final String emailadres="txtUserName";
    public final String girisyapButon="btnLogin";

    public LoginPage(WebDriver driver) {
        super(driver);
    }
}
