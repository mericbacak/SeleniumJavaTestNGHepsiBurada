package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Page {
    WebDriver driver;
    public Page(WebDriver driver){
        this.driver=driver;
    }
    public void ElementgozukenekadarBekle(String elementid){
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(60L));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id(elementid)));
    }

    public void ElementgozukenekadarBekleCss(String css){
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(60L));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(css)));
    }
    public void clickbutton(String Buttonid){
        driver.findElement(By.id(Buttonid)).click();
    }

    public void clickbuttonxpath(String xpathtext){
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(60L));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpathtext)));
    }

    public void typeInto(String elementid, String emailadres){
        driver.findElement(By.id(elementid)).sendKeys(emailadres);
    }

    public void typeIntoCss(String css, String item){
        driver.findElement(By.cssSelector(css)).sendKeys(item);
    }
    public void SendKeyboardButton(String css,Keys button){
        driver.findElement(By.cssSelector(css)).sendKeys(button);
    }
}
