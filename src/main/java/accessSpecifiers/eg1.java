package accessSpecifiers;

public class eg1 {
   private int a = 10;

   //setter method

    public void setvalue(int a){
        this.a = a;
    }
    //getter method
    public int getmethod (){
        this.a = a;
        return a;
    }

}
    class main {
        public static void main(String args[]) {
            eg1 obj = new eg1();
            System.out.println(obj.getmethod());

        }
    }

//default- acts as public
//private- all variables,methods can be accessible where it's created only ie; within class within main method
//protected- all variables,methods can be accessible within class only
//Public - all variables,methods can be accessible anywhere