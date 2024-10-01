import java.util.*;
class Employee
{
String design;
	void setdesign(String design)
	{
		this.design=design;
	}
	String gets()
	{
	return design;
	}
	

}
class hourlyemployee extends Employee
{
	double hour,perwage,day=0,month;
	String name,dep,id;
	
	hourlyemployee(String id,String name,String dep)
	{
	this.id=id;
	this.name=name;
	this.dep=dep;
	System.out.println(id+" "+name+" " +dep+" ");
	}
	//System.out.println(id+" "+name+" " +dep+" ");
	
	
	void calculatewages(double  hour,double perwage)
	{
	day=day+(hour*perwage);
	System.out.println("wage for Day:"+day);
	}
	void monthlywage(double month)
	{
	System.out.println("wage for month:"+(day*month));
	}
}
class weekly extends Employee
{
	double weekt=0,perwage,noofweeks;
	String id,dep,name;
	
	weekly(String id,String name,String dep)
	{
	this.id=id;
	this.name=name;
	this.dep=dep;
	System.out.println(id+" "+name+" " +dep+" ");
	}
	void calculatewages(double week1,double perwage)
	{
		weekt=weekt+(week1*perwage);
		System.out.println("wage for week:"+weekt);
	}
	void monthlywage(double noofweeks)
	{
	System.out.println("wage for month:"+(weekt*noofweeks));
	}
}
class weekhour 
{
	public static void main(String [] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Constract Employee: per Hour");
		hourlyemployee h=new hourlyemployee("B200294","Suresh","WebDeveloper");
		h.setdesign("HR");
		
		System.out.println("designation="+h.gets());
		h.calculatewages(10,500);
		h.monthlywage(28);
		System.out.println("Contract Employee: per week:");
		weekly w=new weekly("B201058","Purushotham","Hacker");
		w.setdesign("HEAD");
		System.out.println("designation="+w.gets());
		w.calculatewages(7,10000);
		w.monthlywage(4);
		
	}
}


