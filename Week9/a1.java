class custException extends Exception
{	
	String message;
	public custException(String message)
	{
		super(message);
	}
}
class cust
{
	static void t() throws custException
	{
		System.out.println("inside the try block and exception :");
		throw new custException("purushotham");
	}
	public static void main(String [] args )
	{	
		try
		{
			
			t();
			}
			catch(custException e)
			{
				System.out.println(e);
			}
			finally
			{
				System.out.println("Success fully Excuted");
			}
	}
}
