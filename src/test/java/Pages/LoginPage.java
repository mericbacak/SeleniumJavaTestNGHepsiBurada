package Pages;

import org.openqa.selenium.WebDriver;

public class LoginPage extends Page{
    public final String emailid ="txtUserName";
    public final String girisyapButonid ="btnLogin";

    public LoginPage(WebDriver driver) {
        super(driver);
    }
}
