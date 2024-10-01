class Mythreading extends Thread
{
	public void run()
	{	
		while(true)
		{
		System.out.println("RED IS STARTS GLOWING:");
		try
		{	
			Thread.sleep(10000);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("RED IS STOPS GLOWING:");
		System.out.println("YELLOW IS STARTS GLOWING:");
		try
		{
		Thread.sleep(10000);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("YELLOW IS STOPS GLOWING:");
		System.out.println("GREEN IS STARTS GLOWING:");
		try
		{
		Thread.sleep(10000);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("GREEN IS STOPS GLOWING:");
		}
	}
}
class traffic 
{
	public static void main(String [] args)
	{	
		Mythreading m=new Mythreading();
		m.start();
	}
}
		
