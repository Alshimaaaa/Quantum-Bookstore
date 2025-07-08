public class DemoBook extends Book {
    public DemoBook(String ISBN, String title, Integer year, Integer price) {
        super(ISBN, title, year, price);
    }
    public void buy(int quantity, String method){
        System.out.println("Demo books are not for sale");
    }
    public boolean shippable(){
        return false;
    }
}
