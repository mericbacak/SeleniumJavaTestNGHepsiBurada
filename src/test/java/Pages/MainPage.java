package Pages;

import org.openqa.selenium.WebDriver;

public class MainPage extends Page{
    public final String hesabim="myAccount";
    public final String girisyap="login";

    public final String searchbar="input[placeholder='Ürün, kategori veya marka ara']";

    public MainPage(WebDriver driver) {

        super(driver);
    }
}
