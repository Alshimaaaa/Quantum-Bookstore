import java.util.*;
public class Bookstore {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        //Add books to inventory
        inventory.addBook(new PaperBook("1234", "Book1", 2018, 100, 5));
        inventory.addBook(new EBook("1235", "Book2", 2022, 50,  "PNG"));
        inventory.addBook(new DemoBook("1236", "Demo", 2005, 0));

        //Will show price details
        inventory.getBook("1234").buy(2, "Giza");
        inventory.getBook("1235").buy(1, "myemail@gmail.com");
        //Will show Error message:
        inventory.getBook("1236").buy(1, "");
        //Will show out of stock message:
        inventory.getBook("1234").buy(4, "Giza");

        System.out.println();
        //Remove outdated books from inventory
        List<Book> removedBooks = inventory.removeOutdatedBooks(5, 2025);
        System.out.println("Removed outdated books: ");
        for (Book book : removedBooks) {
            System.out.println(book.getTitle() + " (" + book.getYear() + ")");
        }
        System.out.println();
        System.out.println("Remaining books:");
        for (Book book : inventory.getBooks().values()) {
            System.out.println(book.getTitle() + " (" + book.getYear() + ")");
        }

    }
}

