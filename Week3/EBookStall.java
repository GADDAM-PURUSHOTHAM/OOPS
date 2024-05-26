/*
Implement the following case study using OOP concepts in Java.
E-Book stall :
Every book has Properties which includes : Book _Name, Book_Author, Book_Count ;
Every Customer is having properties as : Customer_Id, Customer_Name,
Customer_Address and he can buy Books from E-Book stall.
Write a Program which will display the text book name and the remaining count of text
books when a customer buys a text book.
*/
import java.util.Scanner;
class Book {
    String name;
    String authorName;
    int count;
    Book(String name, String authorName, int count) {
        this.name = name;
        this.authorName = authorName;
        this.count = count;
    }
    String details() {
        return "Book name : " + name + "\nAuthor name : " + authorName + "\nBook count : " + count;
    }
    void sellBook() {
        if (count > 0) {
            count--;
            System.out.println("Book sold successfully.");
        } else {
            System.out.println("Sorry, the book is out of stock.");
        }
    }
}

class Customer {
    int id;
    String name;
    String address;

    Customer(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    void buyBook(Book book) {
        System.out.println("Customer: " + name + " is buying a book: " + book.name);
        book.sellBook();
    }
}
public class EBookStall {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n1,n2,i,id,count;
            System.out.print("Enter the no. of books available in book stall : ");
            n1 = sc.nextInt();
            sc.nextLine();
            Book bookList[] = new Book[n1];
            String name,aName,address;
            for(i=0;i<n1;i++)
            {
            	System.out.print("Enter the "+(i+1)+" book's  name : ");
            	name = sc.nextLine();
            	System.out.print("Enter the "+(i+1)+" book's author's name : ");
            	aName = sc.nextLine();
            	System.out.print("Enter the "+(i+1)+" book's count : ");
            	count = sc.nextInt();
            	sc.nextLine();
            	bookList[i] = new Book(name,aName,count);
            }	
            System.out.print("Enter the no. of customers in book stall : ");
            n2 = sc.nextInt();
            Customer cus[] = new Customer[n2];
            for(i=0;i<n2;i++)
            {
            	System.out.print("Enter the "+(i+1)+" customer's id: ");
            	id = sc.nextInt();
            	sc.nextLine();
            	System.out.print("Enter the "+(i+1)+" customer's name : ");
            	name = sc.nextLine();
            	System.out.print("Enter the "+(i+1)+" customer's address : ");
            	address = sc.nextLine();
            	cus[i] = new Customer(id,name,address);
            }
            System.out.print("Enter the customer id who buys : ");
            int cusId = sc.nextInt();
            boolean checkCus = false;
            Customer c=null;
            for(i=0;i<cus.length;i++)
            {
            	if(cus[i].id==cusId)
            	{
            		checkCus = true;
            		c = cus[i];
            		break;
            	}
            }
            if(checkCus)
            {
            	System.out.print("Enter the book the customer wants to buy : ");
            	sc.nextLine();
            	name = sc.nextLine();
            	for(i=0;i<bookList.length;i++)
            	{
            		if(name.equals(bookList[i].name))
            		{
            			c.buyBook(bookList[i]);
            			System.out.println("Book details of the book which was sold : \n"+bookList[i].details());
            			break;
            		}	
            	}
            }
            else
            	System.out.println("Invalid customer id.");
        }
   }  		
}

