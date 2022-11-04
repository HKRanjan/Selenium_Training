package Inheritance;

// Parent class// super class
//child class/sub class
//extend keyword
//java supports multilevel inheritance but not multiple inheritance
public class eg1 {

    int age = 40;
    String name = "Ram";
}
// child class
class eg2 extends eg1 {

    void display() {
        System.out.println(age);
        System.out.println(name);
    }
}// main class
    class main {
        public static void main(String[] args) {

            eg2 obj = new eg2();
            obj.display();
        }
    }
