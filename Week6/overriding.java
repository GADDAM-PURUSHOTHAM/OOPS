class over 
{
	 void print(int n)
	{
		System.out.println(n*6);
	}
	/*void printl(float i,float j)
	{
		System.out.println(i*j);
	}*/
}
class riding extends over 
{
	 void print(int n)
	 {
	 	//super.print(56);
	 	System.out.println(n*5);
	 }
	 void printl(int i,int j)
	 {
	 	System.out.println(i*j);
	 }
	 void printl(double i,double j)
	{
		System.out.println(i*j);
	}
}
class overriding
{
	public static void main(String[] args)
	{
		riding r=new riding();
		r.print(10);
		r.printl(10.1,9.1);
		//r.printl(10,9);
	}
}
	 
