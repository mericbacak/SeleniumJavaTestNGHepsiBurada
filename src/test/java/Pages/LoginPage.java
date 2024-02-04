package Pages;
import base.BasePage;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    public static final org.apache.logging.log4j.Logger logger = LogManager.getLogger(LoginPage.class);
    String kabuletBtn="//button[text()='Kabul et']";
    String girisYapBtn="//span[@title='Giriş Yap']";
    String girisYapBtn2 ="login";
    String UyeolBtn="register";
    String SiparislerimBtn ="//span[@title='Siparişlerim']";
    String SoruVeTaleplerimBtn="//span[@title='Soru ve Taleplerim']";
    String SanaOzelFirsatlarBtn="//span[@title='Sana Özel Fırsatlar']";
    String HepsiPayBtn="//span[@title='Hepsipay']";
    String KullaniciBilgilerimBtn ="//span[@title='Kullanıcı Bilgilerim']";
    String DegerlendirmelerimBtn="//span[@title='Değerlendirmelerim']";
    String BegendiklerimBtn="//span[@title='Beğendiklerim']";
    String TumListelerimBtn="//span[@title='Tüm Listelerim']";
    String KuponlarimBtn="//span[@title='Kuponlarim']";

    public void AcceptCookie(){
        try {
            clickBy(By.xpath(kabuletBtn));

        }catch (Exception e){
            logger.error(e);
        }
    }

    public void LoginandRegisterValidations(String title) {
        AcceptCookie();
        clickBy(By.xpath(girisYapBtn));
        movetoElementClick(By.xpath(girisYapBtn2));
        validatePageCurrentTitle(title);
        /*ElementisExistBy(By.xpath(UyeolBtn),"Üye Ol");
        ElementisExistBy(By.xpath(SiparislerimBtn),"Siparişlerim");
        ElementisExistBy(By.xpath(SoruVeTaleplerimBtn),"Soru ve Taleplerim");
        ElementisExistBy(By.xpath(SanaOzelFirsatlarBtn),"Sana Özel Fırsatlar");
        ElementisExistBy(By.xpath(HepsiPayBtn),"Hepsipay");
        ElementisExistBy(By.xpath(KullaniciBilgilerimBtn),"Kullanıcı Bilgilerim");
        ElementisExistBy(By.xpath(DegerlendirmelerimBtn),"Değerlendirmelerim");
        ElementisExistBy(By.xpath(BegendiklerimBtn),"Beğendiklerim");
        ElementisExistBy(By.xpath(TumListelerimBtn),"Tüm Listelerim");
        ElementisExistBy(By.xpath(KuponlarimBtn),"Kuponlarım");
        logger.info("MainPage Login listbox item validated.");*/
    }

    public void LoginProcessWithoutRegister(){
        AcceptCookie();
        clickBy(By.xpath(girisYapBtn));
        clickBy(By.id(girisYapBtn2));

    }
}