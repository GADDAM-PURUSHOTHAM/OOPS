
class Myclass{};
public class ClassNotFoundException {
   
    /* ClassNotFoundException
    
       - the class's ".class" file cannot be found or was removed from the CLASSPATH

     */
    public static void main(String... args)
    {
        // Trying to load a class that dosent exist here in this packsge or in a folder

        try
        {
            // Class.forName("NonExistentClass");  //ClassNotFoundException error: cannot find symbol
            // Class.forName("This is koduri class created");\
            // Class.meth();

            Myclass mc=new Myclass();
            // mc.meth();

            // System.out.println("ClassNotFoundException caught: " + e.getMessage());

        }
        catch(Exception e)
        {
            // System.out.println(e.getMessage());
        }

    }
}
