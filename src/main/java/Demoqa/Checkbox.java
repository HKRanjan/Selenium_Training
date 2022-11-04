package Demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Checkbox {
    @Test
    public void checkBox() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\Software test program\\Automaton Testing\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/checkbox");
        driver.manage().window().maximize();
        //driver.findElement(By.xpath("//span[contains(text(),\"Home\")]")).click();
        //to verify text is displaying or nor
        //boolean res = driver.findElement(By.xpath("//span[contains(text(),\"You have selected :\")]")).isDisplayed();
        //System.out.println(res);

        boolean result = driver.findElement(By.xpath("//*[@class=\"rct-icon rct-icon-uncheck\"]")).isSelected();
        if (result==false){
            driver.findElement(By.xpath("//*[@class=\"rct-icon rct-icon-uncheck\"]")).click();
        }
        boolean res = driver.findElement(By.xpath("//span[contains(text(),\"You have selected :\")]")).isDisplayed();
        System.out.println(res);
        Thread.sleep(5000);
        driver.close();


    }
}
