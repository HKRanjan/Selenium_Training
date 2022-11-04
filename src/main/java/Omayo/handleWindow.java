package Omayo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

public class handleWindow {
    @Test
    public void hadleWindow(){

        System.setProperty("webdriver.chrome.driver", "D:\\Software test program\\Automaton Testing\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://omayo.blogspot.com/");
        driver.manage().window().maximize();
        String parentwindow = driver.getWindowHandle();
        driver.findElement(By.linkText("Open a popup window")).click();
        Set<String> childwindow = driver.getWindowHandles(); //get all windows value
        Iterator<String> itr = childwindow.iterator(); // this method will iterate from one window to another
        while (itr.hasNext()) {
            String targetchildwindow = itr.next();

            //switch to target child window
            driver.switchTo().window(targetchildwindow);
        }
        if (driver.getTitle().equals("Basic Web Page Title")) {
        driver.close();}
        driver.switchTo().window(parentwindow);


        }
    }
