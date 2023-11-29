package Pages;

import org.openqa.selenium.WebDriver;

public class MainPage extends Page{
    public final String siparislerimxpath="(//a[text()='Siparişlerim'])[1]";

    public final String MyAccountid="myAccount";
    public final String girisyapxpath="//a[text()='Giriş yap']";

    public final String searchbarxpath ="//input[@placeholder='Ürün, kategori veya marka ara']";

    public MainPage(WebDriver driver) {
        super(driver);
    }
}
