import java.util.*;
public class Inventory {
    private Map<String, Book> books = new HashMap<>();

    public void addBook(Book book) {
        books.put(book.getISBN(), book);
    }
    public Book getBook(String ISBN) {
        return books.get(ISBN);
    }
    public List<Book> removeOutdatedBooks(int noOfYears, int thisYear) {
        List<Book> outdatedBooks = new ArrayList<>();
        for (Book book : books.values()) {
            if (thisYear - book.getYear() > noOfYears) {
                outdatedBooks.add(book);
            }
        }
        for (Book book : outdatedBooks) {
            books.remove(book.getISBN());
        }
        return outdatedBooks;
    }
    public Map<String, Book> getBooks(){
        return books;
    }
}
