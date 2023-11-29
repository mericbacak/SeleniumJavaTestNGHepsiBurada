package Tests;

import Pages.LoginPage;
import Pages.MainPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    private WebDriver driver;
    private MainPage mainPage;
    private LoginPage loginPage;

    @BeforeEach
    void Setup(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver118.exe");
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        mainPage= new MainPage(driver);
        loginPage= new LoginPage(driver);
        driver.get("https://www.hepsiburada.com/");
    }

    @Test
    void HepsiBuradaloginTest(){
        //WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(60L));

        mainPage.ElementgozukenekadarBekle(mainPage.siparislerimxpath);
        mainPage.clickbutton(mainPage.siparislerimxpath);
        driver.navigate().back();

        mainPage.ElementgozukenekadarBekleByid(mainPage.MyAccountid);
        mainPage.clickbuttonbyid(mainPage.MyAccountid);

        mainPage.ElementgozukenekadarBekle(mainPage.girisyapxpath);
        mainPage.clickbutton(mainPage.girisyapxpath);

        loginPage.ElementgozukenekadarBekle(loginPage.emailid);
        loginPage.typeInto(loginPage.emailid,"mericbacak@gmail.com");

        mainPage.ElementgozukenekadarBekle(loginPage.girisyapButonid);
        loginPage.clickbutton(loginPage.girisyapButonid);


    }
    @Test
    void SearchItem(){
        mainPage.ElementgozukenekadarBekle(mainPage.searchbarxpath) ;
        mainPage.typeIntoxpath(mainPage.searchbarxpath,"Bugatti");
        mainPage.SendKeyboardButton(mainPage.searchbarxpath, Keys.ENTER);
    }

    @AfterEach
    void Close(){
        driver.close();
    }
}
