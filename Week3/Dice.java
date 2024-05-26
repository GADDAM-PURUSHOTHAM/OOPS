/*
4. Write a java program : rolling a pair of dices 10 times [ each attempt should be delayed by 10000 ms ] and count number Successful attempts.
Successful attempt : If the pair of Dice results in same values
*/


import java.util.Random;

class Dice
{
	public static void main(String arg[]) throws InterruptedException
	{
		Random r = new Random();
		int dice1, dice2;
		int count = 0;
		for(int i=0;i<10;i++)
		{
			dice1 = r.nextInt(1,6);
			dice2 = r.nextInt(1,6);
			if(dice1!=dice2)
			{
				System.out.println("Processing : unsuccessful attempt");
			}
			else if(dice1 == dice2)
			{
				count++;
				System.out.println("Processing : successful attempt");
			}
			Thread.sleep(1000);
		}
		System.out.println("Successful attempts : "+count);
	}
}
				
			


