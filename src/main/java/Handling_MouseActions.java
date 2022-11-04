import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.time.Duration;

public class Handling_MouseActions {
    @Test
    public  void Handling_MouseActions() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\Software test program\\Automaton Testing\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://omayo.blogspot.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement blog = driver.findElement(By.id("blogsmenu"));
        Actions act = new Actions(driver);
        act.moveToElement(blog).perform(); //move cursor to blogs element

        WebElement searchbox = driver.findElement(By.name("q"));
        searchbox.sendKeys("Himanshu");
       act.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();

                Thread.sleep(5000);

        JavascriptExecutor js = (JavascriptExecutor)driver;
       // js.executeScript("window.scrollBy(0,400)","");
        js.executeScript("window.scrollBy(0,600)","driver.findElement(By.name(\"q\"))");
       // driver.close();
    }
}