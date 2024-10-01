class MyThread extends Thread
{
	public void run()
	{
		int i=0;
		while(i<100)
		{
		
			System.out.println("Treading is running:");
			i++;
			try
			{
				Thread.sleep(10000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		
	}
}
class Main
{
	public static void main(String [] args)
	{
		MyThread m=new MyThread();
		m.start();
		int j=0;
		while(j<100)
		{
			
			System.out.println("Treading is run:");
			j++;
			try
			{
			Thread.sleep(3000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		
			
	}
}
