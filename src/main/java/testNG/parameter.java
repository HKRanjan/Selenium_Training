package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameter {
    @Parameters({"browsername", "url"})
    @Test
    public void getUrl(String browserValue, String urlValue) {
        WebDriver driver;
        if (browserValue=="Chrome"){
        System.setProperty("webdriver.chrome.driver", "D:\\Software test program\\Automaton Testing\\chromedriver_win32\\chromedriver.exe");
         driver = new ChromeDriver();
        driver.get(urlValue);
        driver.manage().window().maximize();}
        else {
            System.setProperty("webdriver.chrome.driver", "D:\\Software test program\\Automaton Testing\\chromedriver_win32\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.get(urlValue);
            driver.manage().window().maximize();
        }
    }
}
