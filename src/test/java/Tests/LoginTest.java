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
        driver= new ChromeDriver();
        driver.manage().window().fullscreen();
        mainPage= new MainPage(driver);
        loginPage= new LoginPage(driver);
        driver.get("https://www.hepsiburada.com/");

        // driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    @Test
    void HepsiBuradaloginTest(){
        //WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(60L));

        mainPage.ElementgozukenekadarBekle(mainPage.hesabim);
        mainPage.clickbutton(mainPage.hesabim);

        mainPage.ElementgozukenekadarBekle(mainPage.girisyap);
        mainPage.clickbutton(mainPage.girisyap);

        loginPage.ElementgozukenekadarBekle(loginPage.emailadres);
        loginPage.typeInto(loginPage.emailadres,"mericbacak@gmail.com");

        mainPage.ElementgozukenekadarBekle(loginPage.girisyapButon);
        loginPage.clickbutton(loginPage.girisyapButon);


    }
    @Test
    void SearchItem(){
        mainPage.ElementgozukenekadarBekleCss(mainPage.searchbar);
        mainPage.typeIntoCss(mainPage.searchbar,"Bugatti");
        mainPage.SendKeyboardButton(mainPage.searchbar, Keys.ENTER);
    }

    @AfterEach
    void Close(){
        driver.close();
    }
}
