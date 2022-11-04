import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class Rough {
public static void main(String[]args){

    System.setProperty("webdriver.chrome.driver", "D:\\Software test program\\Automaton Testing\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("http://www.google.com/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        String title = driver.getTitle();
        System.out.println(title);
}


    }
