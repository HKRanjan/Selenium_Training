public class Arrays {

    public static void main(String[] args) {
    /* int[] age = {20,30,40,50,60};

     /*
     to find length of array use method length

     int i = age.length;
     System.out.println(i);
/*
     System.out.println("First Element :" +age[0]);
        System.out.println("Sec Element :" +age[1]);
        System.out.println("Third Element :" +age[2]);
        System.out.println("Fourth Element :" +age[3]);
        System.out.println("Fifth Element :" +age[4]);


for (int x=0;x<age.length;x++){
    System.out.println(age[x]);

      */
        int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {

                    System.out.println("All Value is :" + arr[i][j]);
                }
            System.out.println();
            }

        }
    }




/*
Array to store multiple data of same data type
Syntax
Arraydatatype[]Arrayname;
int[] str;

Arraytype[]Arrayname = new Arraytype[Size of an array];

int[] x = new int[3];
x[0] = 5;
x[1] = 10;
x[2] = 15;
x[3] = 20;

or
int[] x = new int[5,10,15,20];

String[] Fruits = new String["apple","banana","papaya"];

char[] ch = new char['a','b','c'];

2D Array
int[][] = new int[3][3];
x[0][0] = 5;
x[0][1] = 10;
 */