package testNG;

import org.testng.annotations.*;

public class eg2 {
    @BeforeSuite
    public void setup() {
        System.out.println("Setup System property for chrome");
    }
    @BeforeTest
    public void launchbrowser() {
        System.out.println("Launch chrome browser");
    }
    @BeforeClass
    public void enterURL() {
        System.out.println("Enter URL");
    }
    @BeforeMethod
    public void login() {
        System.out.println("Login to app");
    }

    @Test()
    public void googltTitleTest() {
        System.out.println("Google title test");
    }
    @Test
    public void searchTest(){
        System.out.println("Search test");
    }
    @Test
    public void googlelogoTest(){
        System.out.println("Google logo test");
    }
    @AfterMethod
    public void logout(){
        System.out.println("Loogout from app");
    }
    @AfterClass
    public void deleteAllcookies(){
        System.out.println("Delete all Cookies");
    }
    @AfterTest
    public void closebrowser(){
        System.out.println("Close the browser");
    }
    @AfterSuite
    public void generateTestReport(){
        System.out.println("Generare Test Report");
    }



}

