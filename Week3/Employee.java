import java.util.Scanner;

class Employee
{
	int id;
	String name, gender, designation,address;
	int age;
	int salary;
	String getDetails()
	{
		return "Employee name : "+name+"\nEmployee age : "+age+"\nEmployee gender : "+gender+"\nEmployee Designation : "+designation+"\nEmployee address : "+address+"\nEmployee salary : "+salary;
	}	
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		int n,i;
		System.out.print("Enter the no. of employees  : ");
		n = sc.nextInt();
		Employee emp[] = new Employee[n];
		for(i=0;i<n;i++)
		{
			emp[i] = new Employee();
			System.out.print("Enter the id of the "+(i+1)+" employee : ");
			emp[i].id = sc.nextInt();
			sc.nextLine();
			System.out.print("Enter the name of the "+(i+1)+" employee : ");
			emp[i].name = sc.nextLine();
			System.out.print("Enter the age of the "+(i+1)+" employee : ");
			emp[i].age = sc.nextInt();
			sc.nextLine();
			System.out.print("Enter the gender of the "+(i+1)+" employee : ");
			emp[i].gender = sc.nextLine();
			System.out.print("Enter the designation of the "+(i+1)+" employee : ");
			emp[i].designation = sc.nextLine();
			System.out.print("Enter the address of the "+(i+1)+" employee : ");
			emp[i].address = sc.nextLine();
			System.out.print("Enter the salary of the "+(i+1)+" employee : ");
			emp[i].salary = sc.nextInt();
		}
		int searchId;
		System.out.print("Enter the ID to search among the employees : ");
		searchId = sc.nextInt();
		for(i=0;i<n;i++)
		{
			if(searchId == emp[i].id)
			{
				System.out.println("Employee details of the employee id "+searchId+"\n"+emp[i].getDetails());
				break;
			}
		}		
		
	}
	
}		
