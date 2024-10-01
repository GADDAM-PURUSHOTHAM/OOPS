import java.util.Scanner;
import java.io.*;        
public class OrderOfCatchBlocks {
 

    public static void main(String args[])
    {
        try
        {
            // int c=2/0;   //ArthematicException
            int arr[]={1};
            arr[2]=12345;        //ArrayIndexOutOfBoundsException
        }
        catch(ArithmeticException e)      //contineously wrong typing spell of " Arithmetic " check once
        {
            System.out.println(e.getMessage());
        }
        catch(IndexOutOfBoundsException e)   //check spell of  "Bounds " s is not typing
        {
            System.out.println(e.getMessage());
        }
        catch(Exception e)
        {
            System.out.println(e);  //super class exception handle all exceptions
        }

        
        try
        {
            FileInputStream fi=new FileInputStream("my.txt"); 
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        try {

            Thread.sleep(1000);       
        }
        catch (Exception e) {
            System.out.println(e);  
        }
    }
}
