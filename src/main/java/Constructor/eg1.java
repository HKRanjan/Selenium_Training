package Constructor;

// constructor name should be same as class name
// default constructor - by default compiler will execute this constructor
public class eg1 {
    String str;
    eg1(String str) {
        this.str = str;
    }
    public static void main(String[] args){
        eg1 obj = new eg1("Hello World");
        System.out.println(obj.str);
    }

}
