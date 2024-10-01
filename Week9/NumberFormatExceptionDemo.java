public class NumberFormatExceptionDemo {
    
    public static void main(String... args)
    {
        String invalidnumber="abc123";
        try
        {
            int res=Integer.parseInt(invalidnumber); // int res=Integer.parseInt(string)
        }
        catch(NumberFormatException e)
        {
            System.out.println(e);
        }
    }
}
