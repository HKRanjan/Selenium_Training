package exception_handling;

public class eg1_exception {
    public static void main(String[] args){

        int a,b,c;
        a=100;
        b=0;
        c=a/b;
        System.out.println("Result is :" + c);
    }

}

class array{
    public static void main(String args[]) {
        int age[] = {20, 30, 40, 50, 60};


        int len = age.length;
        System.out.println(age[5]);

    }

}




// exception handling in java (Handling errors/issue)
// 1. checked exception- (Compile time exception/error)
  //unreported exc. file not found
//2. Unchecked exception- (Run time exception/error):- syntax/logicical error
    // Arithmatic exception
    // Array index out of bound