class negativeException extends Exception
{
	public String toString()
	{
		return "Negative Exception";
	}
}
class Demo 
{
	static int met(int l ,int b) throws negativeException
	{	
		
		if(l<0 || b<0)
	
		throw new negativeException();
		return l*b;
	}
	static void met1() throws negativeException
	{
		System.out.println("Area is "+met(-10,2));
	}
	static void met2() throws negativeException
	{
		met1();
		
		
	}
	public static void main(String [] args) 
	{
		try
		{
			
		met2();
		}
		catch(negativeException e)
		{
			System.out.println(e);
		}
		
	}
}

		
