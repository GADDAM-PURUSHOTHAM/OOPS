import java.util.*;
class Employee
{
	String fname;
	String lname;
	void  setfname(String fname)
	{
		 this.fname=fname;
	}
	void  setlname(String lname)
	{
		 this.lname=lname;
	}
	
	String getfname()
	{
		return fname;
	}
	String getlname()
	{
		return lname;
	}
}
class contractemployee extends Employee
{
	String dep,design;
	double salary=50000;
	void fullname()
	{
	System.out.println("Full name is "+fname+" "+lname);
	}
	void setdep(String dep)
	{
		this.dep=dep;
	}
	void  setdesign(String design)
	{
		this.design=design;
	}
	String getdep()
	{
		return dep;
	}
	String getdesing()
	{
		return design;
	}
	void salary()
	{
	System.out.println("salary="+salary);
	}
}
class regularemployee extends Employee
{
	String design,dep;
	double salary=100000;
	void fullname()
	{
		System.out.println("Full name="+fname+" "+lname);
	}

	void  setdesign(String design)
	{
		this.design=design;
	}
void setdep(String dep)
{
this.dep=dep;
}

	String getdep()
	{
		return dep;
	}
	String getdesing()
	{
		return design;
	}
	void salary()
	{
	System.out.println("salary="+salary);
	}

}
class employee
{
	public static void main(String [] args)
	{
		Scanner s=new Scanner(System.in);
		 contractemployee c=new contractemployee();
		c.setfname("Gaddam");
		c.setlname("Purushotham");
	c.fullname();
		System.out.println("first name"+c.getfname());
		System.out.println("Last name"+c.getlname());
		//c.salary();
		
		c.setdesign("Normal Employee:");
		c.setdep("Web Developer");
		c.salary();
		System.out.println(c.getdep()+" " +c.getdesing());
		regularemployee r=new regularemployee();
		r.setfname("Kathi");
		r.setlname("Suresh");
	r.fullname();
		System.out.println("first name"+r.getfname());
		System.out.println("Last name"+r.getlname());
		//c.salary();
		
		r.setdesign("HR:");
		r.setdep("App Developer");
		r.salary();
		System.out.println(r.getdep()+" " +r.getdesing());
		
	}
}





		
