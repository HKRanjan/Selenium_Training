package Practice_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

public class AmazonDropDown {

    @Test
    public void dynamicDropDown () throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\Software test program\\Automaton Testing\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        String homepage = driver.getWindowHandle();
        driver.findElement(By.id("twotabsearchtextbox")).click();
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Laptop");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[@aria-label=\"laptop bag\"]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//span[contains(text(),\"Wesley Milestone 2.0 15.6 inch 30 L Casual Waterproof Laptop Backpack/Office Bag/School Bag/College Bag/Business Bag/Unisex Travel Backpack (Blue and Black)\")]")).click();
        Thread.sleep(5000);
        Set<String> childwindow = driver.getWindowHandles();
        Iterator<String> itr = childwindow.iterator();

        while (itr.hasNext()){
            String shopingpage = itr.next();
            driver.switchTo().window(shopingpage);
        }
        if (driver.getTitle().equals("Wesley Milestone 2.0 15.6 inch 30 L Casual Waterproof Laptop Backpack/Office Bag/School Bag/College Bag/Business Bag/Unisex Travel Backpack (Blue and Black) - Buy Wesley Milestone 2.0 15.6 inch 30 L Casual Waterproof Laptop Backpack/Office Bag/School Bag/College Bag/Business Bag/Unisex Travel Backpack (Blue and Black) Online at Low Price in India - Amazon.in"))

            driver.findElement(By.id("add-to-cart-button")).click();

            Thread.sleep(3000);
            driver.switchTo().window(homepage);
            Thread.sleep(3000);
            driver.quit();





        }
    }
//Handling windows-
/*
1.Parent Window- getWindowHandle()- return String value
2. child windows- getWindowHandles()- return set of String values
3. for switching one window to another
 */