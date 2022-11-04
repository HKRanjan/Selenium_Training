package polymorphism;

// method overloading

public class shapes {

    public void add() {
        System.out.println("add two numbers :");
    }

    public void add(int a) {
        System.out.println("Value of a is :" + a);
    }

    public void add(double x, double y) {

        System.out.println("value is :" + x + " " + y);
    }

    public void add(int p, int q) {
        System.out.println("value is :" + p + " " + q);
    }
}

class main1 {
    public static void main (String [] args){
        shapes obj1 = new shapes();
        obj1.add();
        obj1.add(8);
        obj1.add(6,4);
        obj1.add(30.24, 20.29);


    }
}




