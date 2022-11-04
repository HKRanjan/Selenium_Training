package Inheritance;
//Multilevel Inheritance
public class eg5 {
    void brandname()
    {
        System.out.println("Toyota");

    }
}
class eg6 extends eg5{
    void color(){
        System.out.println("Red");
    }
    void brandname()
    {
        System.out.println("BMW");
        super.brandname();

    }
}
class eg7 extends eg6{
  void model(){
      System.out.println("Vehicle");
  }


public static void main (String[] args){
  eg7 obj = new eg7();
  obj.brandname();
  obj.model();
  obj.color();

  }
}



//method overriding- when parent class method and child class method is
// same child class method will override parent class method
//Super keyword is used to use both parent and child class methods/variables