package Inheritance;
//Parent class
public class eg3 {
    int salary = 40000;
}
// subclass
class eg4 extends eg3{

    int age = 40;
    String name = "Vairav";
}

class result {
    public static void main(String[] args){
    eg4 obj = new eg4();
        System.out.println("Name of the employee is :" + obj.name);
    System.out.println("Age of the employee is :" + obj.age);
        System.out.println("Salary of the employee is :" + obj.salary);

}}