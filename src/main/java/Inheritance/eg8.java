package Inheritance;

public class eg8 {

    String color = "Black";
    }
    class eg9 extends eg8{

    String color = "White";

    void displaycolor(){

        System.out.println("Color is: " + color + " " + super.color);
    }
    public static void main(String[] args){

        eg9 obj = new eg9();
        obj.displaycolor();
    }
    }
