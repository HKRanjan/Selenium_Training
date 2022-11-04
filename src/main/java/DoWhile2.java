public class DoWhile2 {
    public static void main (String args[]){

        int x=10, sum=0;
        do {
            sum= sum+x;
            x--;
        }
        while (x>5);
        System.out.println("Sum is :"+sum);
    }
}
/*
sum = 0+10 =10
x=10-1=9
9>5
sum= 10+9=19
x=9-1=8
8>5
sum=19+8=27

 */