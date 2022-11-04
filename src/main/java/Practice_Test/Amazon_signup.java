package Practice_Test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Amazon_signup {
    @Test
    public void Amazon_signup(){

        System.setProperty("webdriver.chrome.driver", "D:\\Software test program\\Automaton Testing\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        driver.findElement(By.id("nav-logo-sprites"));
        driver.findElement(By.xpath("(//a[contains(text(),\"Start here.\")])[2]")).click();

        driver.findElement(By.id("ap_customer_name")).sendKeys("Abc Xyz");
        driver.findElement(By.id("ap_phone_number")).sendKeys("1234567890");
        driver.findElement(By.id("ap_email")).sendKeys("test123@gmail.com");
        driver.findElement(By.id("ap_password")).sendKeys("1234@Abc");
        driver.findElement(By.id("continue")).click();














    }
}
