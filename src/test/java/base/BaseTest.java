package base;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseTest {
    public WebDriver driver;
    @BeforeTest
    public void before(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        //chromeOptions.addArguments("--headless");
        chromeOptions.addArguments("start-maximized");
        chromeOptions.addArguments("disable-infobars");
        chromeOptions.addArguments("disable-pop-up-blocking");
        chromeOptions.addArguments("--version");
        chromeOptions.addArguments("enable-automation");
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver= new ChromeDriver(chromeOptions);
        driver.get("https://www.hepsiburada.com/");
    }
    @AfterTest
    public void after() {
        driver.quit();
    }
}
