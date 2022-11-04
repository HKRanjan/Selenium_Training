package HYRTutorial;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class alertHandling {

    @Test
    public void AlertHandling() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\Software test program\\Automaton Testing\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
        driver.manage().window().maximize();
        //1st alert

        driver.findElement(By.id("alertBox")).click();
        Thread.sleep(3000);
        String value = driver.switchTo().alert().getText();
        System.out.println(value);
        driver.switchTo().alert().accept();
        Thread.sleep(3000);
        //2nd alert
        driver.findElement(By.id("confirmBox")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().dismiss();
        Thread.sleep(3000);

        //3rd alert
        //alternate way to handle click method using javascript executor

        WebElement element1 = driver.findElement(By.id("promptBox"));

        JavascriptExecutor js= (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", element1);

        driver.switchTo().alert().sendKeys("Himanshu");
        Thread.sleep(3000);
       Alert al = driver.switchTo().alert();
       System.out.println(al.getText());
       al.sendKeys("Himanshu");
       al.accept();
       Thread.sleep(5000);
       driver.quit();


    }
}