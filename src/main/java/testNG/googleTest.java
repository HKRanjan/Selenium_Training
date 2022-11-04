package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class googleTest {
    WebDriver driver;
    @BeforeMethod
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "D:\\Software test program\\Automaton Testing\\chromedriver_win32\\chromedriver.exe");
         driver = new ChromeDriver();
        driver.get("http://www.google.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
    }
    @Test(priority = 1)
    public void googletitletest(){
        String title = driver.getTitle();
        System.out.println(title);
    }
    @Test(priority = 2)
    public void googlelogotest(){
       boolean logo = driver.findElement(By.xpath("//img[@alt=\"Google\"]")).isDisplayed();
       System.out.println(logo);
    }
    @Test
    public void mailLinkTest(){
       boolean mail = driver.findElement(By.linkText("Gmail")).isDisplayed();
       System.out.println(mail);
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }


}
