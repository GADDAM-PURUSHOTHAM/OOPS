import java.util.Scanner;
class entrance{
synchronized public void enter(int y){
System.out.println("Person"+y+"showed the ticket to the boy");
System.out.println("Person"+y+"entered the Theatre");
}}
class person extends Thread{
int y;
entrance s;
person(int x,entrance e){
s=e;
y=x;
}
public void buyticket(){
System.out.println("Person"+y+"bought the ticket");
}
public void run(){
buyticket();
s.enter(y);
}}
 class TheaterThread{
public static void main(String args[]){ Scanner
sc=new Scanner(System.in); System.out.print("Enter the no of persons:"); 
int n=sc.nextInt();
person p[]=new person[n+1];
entrance e=new entrance();
for(int i=1;i<=n;i++)
p[i]=new person(i,e);
for(int i=1;i<=n;i++)
p[i].start();
}}
