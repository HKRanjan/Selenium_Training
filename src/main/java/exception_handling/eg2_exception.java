package exception_handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class eg2_exception {

    public static void main (String[] args) throws FileNotFoundException {

        FileInputStream obj = null;

        try {
            obj = new FileInputStream("demo.txt");
        }
        catch (FileNotFoundException e)
        {System.out.println(" it will catch file not found exception");}


    }
}



// checked exception

//try
//catch
// finally
//throws