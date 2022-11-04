package polymorphism;

public class polymorohism {

    // run time polymorphism

    public void area(){
        System.out.println("Print the area");
    }
}

class rectangle extends polymorohism{
    public void area(){
        System.out.println("area of polymorphism.rectangle");
    }
}

class triangle extends polymorohism{
    public void area(){
        System.out.println("area of polymorphism.triangle");
    }}

    class main{
        public static void main (String[] args){

            polymorohism obj1 = new polymorohism();
            polymorohism obj2 = new rectangle();
            polymorohism obj3 = new triangle();

            obj1.area();
            obj2.area();
            obj3.area();
        }
    }



//one method can be uswd in numerous ways
// compile time polymorphism
//run time polymorphism
/*
method overriding - Inheritance (same name methods with same parameters)
Method overloading - Polymorphism (same name with different parameters (same datatype or else diff. datatypes)

 */