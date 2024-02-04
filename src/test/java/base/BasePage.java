package base;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;

public class BasePage {
    public WebDriver driver;
    public BasePage(WebDriver driver){
        this.driver = driver;
    }

    public void clickBy(By by) {
        WebDriverWait waiter = new WebDriverWait(driver, Duration.ofSeconds(15));
        WebElement element= waiter.until(ExpectedConditions.elementToBeClickable(by));
        element.click();
    }
    public void movetoElementClick(By by){
        WebDriverWait waiter = new WebDriverWait(driver, Duration.ofSeconds(15));
        WebElement element= waiter.until(ExpectedConditions.visibilityOfElementLocated(by));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().build().perform();
    }

    public void setById(By by, String value){
        WebDriverWait waiter = new WebDriverWait(driver, Duration.ofSeconds(15));
        WebElement element = waiter.until(ExpectedConditions.elementToBeClickable(by));
        element.sendKeys(value);
    }

    public void SendKeysBy(By by, String text){
        WebDriverWait waiter = new WebDriverWait(driver, Duration.ofSeconds(15));
        WebElement element = waiter.until(ExpectedConditions.presenceOfElementLocated(by));
        element.click();
        element.sendKeys(text);
        element.clear();
        element.sendKeys(text);
    }

    public void PolidToActionDownEnter(By by,String Polid){
        WebDriverWait waiter = new WebDriverWait(driver, Duration.ofSeconds(15));
        WebElement element = waiter.until(ExpectedConditions.elementToBeClickable(by));
        element.click();
        Actions actions = new Actions(driver);
        actions.sendKeys(Polid).perform();
        actions.sendKeys(Keys.ENTER).perform();
    }

    public void ElementisExistBy(By by, String value){
        WebDriverWait waiter = new WebDriverWait(driver, Duration.ofSeconds(15));
        WebElement element = waiter.until(ExpectedConditions.visibilityOfElementLocated(by));
        element.isDisplayed();
        String elementText= element.getText();
        Assert.assertTrue((elementText.contains(value)));
    }
    public void validatePageCurrentTitle(String title){
        String actualTitle=driver.getCurrentUrl();
        Assert.assertEquals(title,actualTitle);
    }
    public void SelectByVisibleText(By by, String text){
        WebDriverWait waiter = new WebDriverWait(driver, Duration.ofSeconds(15));
        WebElement element = waiter.until(ExpectedConditions.presenceOfElementLocated(by));
        Select select = new Select(element);
        select.selectByValue(text);
    }
}