import java.util.*;
class exp
{
	String name,nn;//="puru";
	void r(String nn)
	{
	this.nn=nn;
	System.out.println(nn);
	}
	
	
	 void exp1(String name)
	{
		//this.name=name;
		System.out.println(name);
	}
	/*void n()
	{
		System.out.println(name);
	}*/
	
}
 class hh extends exp
{
	 void  exp1(String name)
	{
	//super.name();
	//System.out.println(name);
	//n(name);
	super.exp1("puru");
		System.out.println(name);
	}
}
class supers
{	
	static int v=12;
	static void si()
	{
		System.out.println(v);
	}
	public static void main(String [] args)
	{
		Scanner s=new Scanner(System.in);
		
		si();
		hh e=new hh();
		e.exp1("gaddam");
		//e.n();
		
		//hh s=new hh();
		//e.supe();
	}
}
		
	
	
