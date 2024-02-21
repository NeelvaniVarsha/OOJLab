     import java.util.Scanner;

     public class Book {
         String name;
         String author;
         double price;
         int numPages;
     
         public Book(String name, String author, double price, int numPages) {
             this.name = name;
             this.author = author;
             this.price = price;
             this.numPages = numPages;
         }
     
         public String getName() {
             return name;
         }
     
         public String getAuthor() {
             return author;
         }

         public double getPrice() {
             return price;
         }
     
         public int getNumPages() {
             return numPages;
         }
     
         public void setName(String name) {
             this.name = name;
         }
     
         public void setAuthor(String author) {
             this.author = author;
         }
     
         public void setPrice(double price) {
             this.price = price;
         }
     
         public void setNumPages(int numPages) {
             this.numPages = numPages;
         }

         public String toString() {
             return "Book Details:\n" +
                     "Name: " + name + "\n" +
                     "Author: " + author + "\n" +
                     "Price: " + price + "\n" +
                     "Number of Pages: " + numPages;
         }

         public static void main(String[] args) {
             Scanner s = new Scanner(System.in);

             System.out.print("Enter the number of books: ");
             int numBooks = s.nextInt();
             s.nextLine(); 

             Book[] books = new Book[numBooks];

             for (int i = 0; i < numBooks; i++) {
                 System.out.println("\nEnter details for Book " + (i + 1) + ":");
                 System.out.print("Name: ");
                 String name = s.nextLine();
                 System.out.print("Author: ");
                 String author = s.nextLine();
                 System.out.print("Price: ");
                 double price = s.nextDouble();
                 System.out.print("Number of Pages: ");
                 int numPages = s.nextInt();
                 s.nextLine(); 

                 books[i] = new Book(name, author, price, numPages);
             }

             System.out.println("\nBook details:");
             for (int i = 0; i < numBooks; i++) {
                 System.out.println("\nBook " + (i + 1) + ":");
                 System.out.println(books[i].toString());
             }

             s.close();
         }
     }
