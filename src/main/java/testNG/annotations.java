package testNG;

import org.testng.annotations.*;

public class annotations {
    @Test
    public void test()
    {
        System.out.println("main");
    }
    @BeforeMethod
   public void beforeMethod(){
        System.out.println("before main");
   }
   @AfterMethod
   public void afterMethod(){
       System.out.println("after main");
   }
   @BeforeClass
    public void beforeclass(){
       System.out.println("before class");
   }
    @AfterClass
    public void afterclass(){
        System.out.println("after class");
    }
    @BeforeTest
    public void beforetest(){
        System.out.println("before test");
    }
    @AfterTest
    public void aftertest(){
        System.out.println("after test");
    }
    @BeforeSuite
    public void beforesuite(){
        System.out.println("before suite");
    }
    @AfterSuite
    public void aftersuite(){
        System.out.println("after suite");
    }
}
