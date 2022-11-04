package Practice_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProvider_testcase {
    @Test(dataProvider ="LoginData" )
    public void facebookLogin (String Username, String Password) throws InterruptedException {
        //Step 1. launch the chrome browser

        System.setProperty("webdriver.chrome.driver","D:\\Software test program\\Automaton Testing\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Step 2. navigate to facebook url
    driver.get("https://www.facebook.com/");
    //maximize browser window
    driver.manage().window().maximize();
    //Step 3
    driver.findElement(By.xpath("//img[@alt=\"Facebook\"]"));
    //Step 4
    driver.findElement(By.id("email")).sendKeys(Username);
    //Step 5
        driver.findElement(By.name("pass")).sendKeys(Password);
    //Step 6
        driver.findElement(By.cssSelector("button[name='login']")).click();
        Thread.sleep(5000);

       /* driver.navigate().to("https://www.amazon.in/");
        Thread.sleep(5000);
        driver.navigate().back();
        Thread.sleep(5000);*/
        driver.close(); // to close the current browser
        driver.quit();  //to close all the browser

        }
        @DataProvider(name="LoginData")
        public Object[][] enterLoginData()
        {
            Object data[][] = {{"abc@gmail.com","12345"},{"xyz@gmail.com","5678"}};
       /* Object[][] data = new Object[3][2];
        data[0][0]= "abc@gmail.com";
        data[0][1]= "12345";

        data[1][0]="xyz@gmail.com";
        data[1][1]="5678";

        data[2][0]= "lmn@gmail.com";
        data[2][1]= "6789";*/
        return data;
        }


}
/*
Syntax for css selector
tagname[attribute="value"]
 */

//Automating login page of face book
/*
Step 1. launch the chrome browser
Step 2. navigate to facebook url
Step 3. verify login page
Step 4. enter user id
Step 5. inter pass word
Step 6. click on login button
Step 7. verify successful login
 */