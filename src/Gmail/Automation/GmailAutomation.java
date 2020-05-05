package Gmail.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailAutomation {

   
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver","C:\\Users\\HP\\Desktop\\Selenium\\Drivers\\geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        
        driver.get("https://google.com");
        driver.findElement(By.xpath("//a[@id='gb_70']")).click();
        
        WebElement email=driver.findElement(By.xpath("//input[@id='identifierId']"));
        email.sendKeys("patilsagar1535@gmail.com");
        
        WebElement next=driver.findElement(By.xpath("//span[@class='RveJvd snByac']"));
        next.click();
        
        Thread.sleep(900);
        driver.navigate().refresh();
        WebElement pass=driver.findElement(By.xpath("//input[@name='password']"));
        pass.sendKeys("sagar9860195534");

        WebElement submit=driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
        submit.click();
        
        WebElement Gmail=driver.findElement(By.xpath("//a[contains(text(),'Gmail')]"));
        Gmail.click();

    }
    
    
}
