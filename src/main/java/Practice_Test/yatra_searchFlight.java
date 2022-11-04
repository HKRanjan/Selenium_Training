package Practice_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class yatra_searchFlight {
    @Test
    public void yatraSearchFlight() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\Software test program\\Automaton Testing\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.yatra.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.id("BE_flight_flsearch_btn")).click();

        driver.findElement(By.id("BE_flight_origin_city")).click(); // clicking on departs dropdown
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.findElement(By.xpath("(//ul//div/li)[3]//p[contains(text(),\"Bangalore \")]")).click();//clicks bangalore option
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//ul//div/li)[4]//p[contains(text(),\"Chennai \")]")));
       driver.findElement(By.xpath("(//ul//div/li)[4]//p[contains(text(),\"Chennai \")]")).click();
        Thread.sleep(2000);
       driver.findElement(By.id("BE_flight_origin_date")).click();
       Thread.sleep(5000);
       driver.findElement(By.xpath("((//div[@id=\"monthWrapper\"]//table//tbody//tr)[2]//td)[2]")).click();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
       driver.findElement(By.id("BE_flight_paxInfoBox")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

       for (int a=1;a<3;a++){
           driver.findElement(By.xpath("(//span[@class=\"ddSpinnerPlus\"])[1]")).click();
       }
        String adults = driver.findElement(By.xpath("(//span[@class=\"adultcount\"])[1]")).getText();
        System.out.println(adults);
        for (int c=1;c<3;c++){
            driver.findElement(By.xpath("(//span[@class=\"ddSpinnerPlus\"])[2]")).click();
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    boolean flightclass = driver.findElement(By.xpath("//span[contains(text(),\"Premium Economy\")]")).isSelected();
    if (flightclass == false){
        driver.findElement(By.xpath("//span[contains(text(),\"Premium Economy\")]")).click();
    }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    boolean opt = driver.findElement(By.xpath("//a[@title=\"Non Stop Flights\"]")).isSelected();
    if (opt == false) {
        driver.findElement(By.xpath("//a[@title=\"Non Stop Flights\"]")).click();
    }     driver.quit();

    }
}

/* Table:-
<table>
<th> table head </th>
    <tr> table rows </tr>
        <td> table data </td>
 */