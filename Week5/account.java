import java.util.*;
class Account
{
	double balance;
	String name;
	String acctno;
	String address;
	
	
	Account(double  balance,String name ,String acctno,String address)
	{
	this.balance=balance;
	this.name=name;
	this.acctno=acctno;
	this.address=address;
	}
	
       void  credit(double camount)
       {
       balance=balance+camount;
       System.out.println("credit of your bank account="+camount);
		System.out.println("total balance of your bank="+balance);
	}
	void debit(double bamount)
	{
	if(balance>bamount)
	{
	balance=balance-bamount;
	System.out.println("debited from your bank account="+bamount);
	System.out.println("total balace of your bank="+balance);
	}
	else
	{
	System.out.println("your balance is not enough money:");
	}
	}
	void getbalance()
	{
	System.out.println(balance);
	}
	void getdetail()
	{
	System.out.println("account no="+acctno+"name="+name+"Balance="+balance+"Address="+address);
	}
	
	public static void main(String [] args)
	{Scanner s=new Scanner(System.in);
	
	String n,aa,no;
	double b;
	System.out.println("enter the bank account number:");
	no=s.next();
	System.out.println("enter the bank account name:");
	n=s.next();
	System.out.println("enter the bank account address:");
	aa=s.next();

	
	Account a=new Account(500.00,n,no,aa);
	int p;
	System.out.println("1.credit 2.debit 3.getbalace 4.bank details");
	while(true)
	{
	p=s.nextInt();

	switch(p)
	{
	case 1:System.out.println("enter the credited amount"); double cc=s.nextDouble();a.credit(cc);
	break;
	case 2:System.out.println("enter the how much amount you will debit");double ccc=s.nextDouble();a.debit(ccc);
	break;
	case 3:a.getbalance();
	break;
	case 4:a.getdetail();
	break;
	default:System.out.println("invalid");
	}
	}}
}
	
