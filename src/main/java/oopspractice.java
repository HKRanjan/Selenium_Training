public class oopspractice {

    int add (int a, int b){
        int x = a+b;
        System.out.println(x);
        return x;
    }

    void sub (int c, int d){
        int z = c-d;
        System.out.println(z);
    }

    public static void main (String[] args){

        oopspractice obj = new oopspractice();
        obj.add(5,7);
        obj.sub(8,5);
    }
}






