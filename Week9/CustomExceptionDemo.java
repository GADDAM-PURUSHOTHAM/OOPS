class CustomMyException extends Exception
{
    private String StoreMsg;
    CustomMyException(String Msg)
    {
        StoreMsg=Msg;
    }
    public void PrintStoredMsg()
    {
        System.out.println("Custom Stored String of Exception msg ::: "+StoreMsg);
    }
}

public class CustomExceptionDemo {

    public static void main(String... args)
    {
        try
        {
            throw new CustomMyException("Eyyu............Therru");
        }
        catch(CustomMyException e)
        {
            // e.PrintStoredMsg();
            System.out.println(e);
        }
    }
    
}
