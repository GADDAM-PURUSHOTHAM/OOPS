class consumr extends Thread
{
	public void run()
	{	
			int i=7;
			while(i>=0)
			{
				
			if(i>0)
			{
			System.out.println("the data product status is over or not ");
			i--;
			
			try
		{
		Thread.sleep(1000);
		}
		catch(Exception e)
		{
			System.out.println(e);
		
		}
		}
		else
		{
			System.out.println("product data over:");
			break;
		}
			}
			
	}
}
class production 
{
	public static void main(String [] args)
	{
		consumr c=new consumr();
		c.start();
		
	}
}
