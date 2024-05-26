import java.util.Scanner;

class Book {
    private String bookName;
    private String bookAuthor;
    private int bookCount;

    public Book(String bookName, String bookAuthor, int bookCount) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookCount = bookCount;
    }

    public String getBookName() {
        return bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public int getBookCount() {
        return bookCount;
    }

    public void displayBookDetails() {
        System.out.println("Book Name: " + bookName);
        System.out.println("Author: " + bookAuthor);
        System.out.println("Available Count: " + bookCount);
    }

    public void buyBook() {
        if (bookCount > 0) {
            bookCount--;
            System.out.println("Book purchased successfully. Remaining count: " + bookCount);
        } else {
            System.out.println("Sorry, the book is out of stock.");
        }
    }
}

class Customer {
    private int customerId;
    private String customerName;
    private String customerAddress;

    public Customer(int customerId, String customerName, String customerAddress) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
    }

    public void displayCustomerDetails() {
        System.out.println("Customer ID: " + customerId);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Customer Address: " + customerAddress);
    }

    public void buyBook(Book book) {
        System.out.println("Customer " + customerName + " is buying the following book:");
        book.displayBookDetails();
        book.buyBook();
    }
}

class EbookStall {
    public static void main(String[] args) {
        // Creating a sample book
        Book textbook = new Book("Java Programming", "John Doe", 5);

        // Creating a sample customer
        Customer customer1 = new Customer(1, "Alice", "123 Main St");

        // Displaying customer details
        System.out.println("Customer Details:");
        customer1.displayCustomerDetails();

        // Buying a book
        customer1.buyBook(textbook);

        // Displaying updated book details
        System.out.println("\nUpdated Book Details:");
        textbook.displayBookDetails();
    }
}

