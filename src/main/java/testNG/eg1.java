package testNG;

import org.testng.annotations.Test;

public class eg1 {
    @Test(priority = 1,description ="This method will add two numbers" )
    public void additionNum()
    {
        int x = 5, y = 6;
        int z = x+y;
        System.out.println(z);
    }
    @Test(priority = 2)
    public void sub()
    {  int p=10, q=5;
    int r = p-q;
    System.out.println(r);}
    @Test(dependsOnMethods = {"additionNum","sub"})
    public void multi()
    {
        int a=6, b=4;
        int c= a*b;
        System.out.println(c);
    }
}
