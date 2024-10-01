class CustomException extends Exception
{
    public CustomException(String msg)
    {
        super(msg);
    }
}

public class ThrowThrowsFinallyDemo {
    public static void main(String args[])
    {
        try
        {
            MyException();  //get throwed exception from MyException method throwed one is object of CustomException which extend Exception class

            // throw new Exception("This is custom msg");   //to see run remove exception comment and catch of Exception class
        }
        catch(CustomException e)
        {
            System.out.println(e.getMessage());
            // System.out.println(e);
        }
        catch(Exception e)       //ref.. @ksv IMGSRC12765365324 at windows files
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("Finally will  Exiutes always");
        }

    }
    public static void MyException () throws CustomException
    {
        throw new CustomException("\nThis is custom Exception msg called from MyException method in ThrowThrowsFinallyDemo class");
    }
}
