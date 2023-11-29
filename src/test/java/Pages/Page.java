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

    public void ElementgozukenekadarBekle(String elementxpah){
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(60L));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(elementxpah)));
        System.out.println("Görüntülenen elementin texti "+ driver.findElement(By.xpath(elementxpah)).getText());
    }

    public void ElementgozukenekadarBekleByid(String elementid){
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(60L));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(elementid)) );
    }
    public void clickbutton(String path){
        driver.findElement(By.xpath(path)).click();
    }

    public void clickbuttonbyid(String id){
        driver.findElement(By.id(id)).click();
    }

    public void typeInto(String elementid, String emailadres){
        driver.findElement(By.id(elementid)).sendKeys(emailadres);
    }

    public void typeIntoxpath(String path, String item){
        driver.findElement(By.xpath(path)).sendKeys(item);
    }
    public void SendKeyboardButton(String path,Keys button){
        driver.findElement(By.xpath(path)).sendKeys(button);
    }
}
