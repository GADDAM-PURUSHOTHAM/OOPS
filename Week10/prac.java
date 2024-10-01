class red extends Thread
{
	public void run()
	{	
		
		System.out.println("RED ON:");
		try
		{
		Thread.sleep(10000);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("RED OFF:");
		yellow y=new yellow();
		y.start();
		try
		{
			y.join();
		}
		catch(Exception e)
		{
		}
		
	}

}
class yellow extends Thread
{
	public void run()
	{
	
		System.out.println("YELLOW NO:");
		
		try
		{
		Thread.sleep(10000);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("YELLOW OFF");
		green g=new green();
		g.start();
		try
		{
			g.join();
		}
		catch(Exception e)
		{
			}

		
		}

}
class green extends Thread 
{
		public void run()
		{
			
		System.out.println("GREEN ON");
		try
		{
		Thread.sleep(10000);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("GREEN OFF");
		red r=new red();
		r.start();
		try
		{
			r.join();
		}
		catch(Exception e)
		{
			
		}
}
}
class traffic 
{
	public static void main(String [] args)
	{	
		red r=new red();
		r.start();
		
		
		
		
		
	}
}
		
