package artofTestingSite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDown {
    @Test
    public void StaticDropDown() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\Software test program\\Automaton Testing\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://artoftesting.com/samplesiteforselenium");
        driver.manage().window().maximize();
        Select obj = new Select(driver.findElement(By.id("testingDropdown")));
        obj.selectByIndex(2);
        obj.selectByValue("Automation");
        obj.selectByVisibleText("Performance Testing");
        String str = obj.getFirstSelectedOption().getText();
        System.out.println(str);

        Thread.sleep(5000);

        //driver.close();
    }
}

/*
Syntax to handle static drop down:-
select

 */