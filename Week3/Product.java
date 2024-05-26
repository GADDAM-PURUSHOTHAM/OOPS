import java.lang.*;
import java.util.*;
class Product
{
	public static void main(String [] args)
	{
	Scanner s=new Scanner(System.in);
	
	double product1;
	double product2;
	double product3;
	double product4;
	double product5;
	int q;
	double total=0;
	int choice=0;
	
	while(choice!=6)
	{
	
	System.out.println(" product1=99.90 , product2=20.20,product3=6.87,product4=45.50,product5=40.49");
	
	choice=s.nextInt();
	
	
	switch(choice)
	{
	case 1:
	System.out.println("Oil pocket:");
	product1=99.90;
	System.out.println("enter the Quantinty of product ");
	q=s.nextInt();
	total=total+(q*product1);
	break;
	case 2:product2=20.20;
	System.out.println("enter the Quantinty of product ");
	q=s.nextInt();
	total=total+(q*product2);
	break;
	case 3:product3=6.87;
	System.out.println("enter the Quantinty of product ");
	q=s.nextInt();
	total=total+(q*product3);
	break;
	case 4:product4=45.50;
	System.out.println("enter the Quantinty of product ");
	q=s.nextInt();
	total=total+(q*product4);
	break;
	case 5:product5=40.49;
	System.out.println("enter the Quantinty of product ");
	q=s.nextInt();
	total=total+(q*product5);
	break;
	case 6:System.out.println("total sales="+total);
	default:System.out.println("Successfully sold");
	}
}
//System.out.println("total sales="+total);
}	}
	
