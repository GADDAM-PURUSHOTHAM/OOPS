public class RethrowAnException {
    public static void main(String... args)
    {
        try
        {
            one();
        }
        catch(Exception e)
        {
            System.out.println(e);
            e.printStackTrace();
        }
    }
    public static void one() throws Exception
    {
        // System.out.println("Re-throwing exception of method two from method one to main");
        two();  //Re-throwing exception of method two from method one to main
    }
    public static void two() throws Exception
    {
        System.out.println("throing an exception from method 2");
        throw new Exception("This is custom msg thrown from method two to method one");
    }
}
