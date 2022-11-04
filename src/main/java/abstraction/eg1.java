package abstraction;

abstract class eg1 {

    abstract void run();
}

class vehicle extends  eg1{
    void run() {
        System.out.println("Run safely");
    }
    public void display(){
        System.out.println("it is a non-abstract method");
    }
    public static void main (String[] args){

        vehicle obj = new vehicle();
        obj.run();
        obj.display();
    }
}



// abstract keyword is used in class.
/* abstract class contains both non- abstract and abstract method.class
abstract class declares with abstract keyword

only
 */