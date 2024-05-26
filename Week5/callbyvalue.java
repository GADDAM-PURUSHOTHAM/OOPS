import java.util.*;
class myclass
{
	int value;
	myclass(int value)
	{
	this.value=value;
	}
}
class callby
{
	public static void main(String args[])
	{
		int v=30;
		System.out.println("before call the value:"+v);
		mod(v);
		System.out.println("After the call by value:"+v);
		
		myclass obj=new myclass(40);
		System.out.println("before call the object:"+obj.value);
		modobj(obj);
		System.out.println("after call by object:"+obj.value);
	}
static void mod(int c)
{
c=20;
System.out.println("inside the value of call by value:"+c);
}
static void modobj(myclass obj)
{
obj.value=50;
System.out.println("inside the call by object:"+obj.value);
}
}

		
