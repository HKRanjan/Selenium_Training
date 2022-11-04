public class string_manipulation {

    // String Manipulation

    public static void main(String[] args){

      String str = "Hello World";

      // lenghth
        int i = str.length();
        System.out.println(i);

        String one = "Selenium";
        String two = "Training";

       // Concatenate
        String result = one.concat(two);
        System.out.println(result);


        // Compare two strings
        boolean result1 = one.equals(two);
        System.out.println(result1);

        // to change case
      String ONE = one.toUpperCase();
      System.out.println(ONE);

      //Contains: print tru/false if sub string is present in string or not

      boolean result2 = str.contains("Hello");
      System.out.println(result2);

      // indexof : to find index position of a character
      int a= str.indexOf('W');
      System.out.println(a);

      //substring: to fetch sub string from the string

      String result3 = str.substring(5);
      System.out.println(result3);

      String result4 = str.substring(6,10);
      System.out.println(result4);

      //replace : to replace a sub string

      String result5 = str.replace("World","Java");
      System.out.println(result5);

      //trim: removes space from beginig and end of string
    String str1 = "   Hello    World   ";
    String result6 = str1.trim();
    System.out.println(result6);

    //split: split the string from operator provided and stores as array
      //(eg. dd:mm:yyyy, if provided operator ":" it will split string as dd, mm, yyyy
      // same for dd/mm/yyyy need to use "/" to split)
    String result7[] = str.split(" ");
    System.out.println(result7[0]);
    }
}


/*
String is IMMUTABLE
 */