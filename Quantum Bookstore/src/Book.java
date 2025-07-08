public abstract class Book {
    protected String ISBN;
    protected String title;
    protected Integer year;
    protected Integer price;
    public Book(String ISBN, String title, Integer year, Integer price) {
        this.ISBN = ISBN;
        this.title = title;
        this.year = year;
        this.price = price;
    }
    public abstract void buy(int quantity, String method);
    public abstract boolean shippable();
    public String getTitle() {
        return title;
    }
    public Integer getPrice() {
        return price;
    }
    public Integer getYear() {
        return year;
    }
    public String getISBN() {
        return ISBN;
    }
}
