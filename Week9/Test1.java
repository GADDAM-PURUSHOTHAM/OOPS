class MyException extends Exception
{
    MyException(String msg)
    {
        super(msg);
    }
}

public class Test1
{
    public static void main(String args[])
    {
        try
        {
            throw new MyException("Custom msg ksv");
        }
        catch(MyException e)
        {
            System.out.println("Got an Exception: "+e);
        }
        finally
        {
            System.out.println(" Fainally: This will always Exicute ");
        }
    }
}