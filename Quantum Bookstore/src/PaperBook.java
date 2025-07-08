public class PaperBook extends Book {
    private int stock;

    public PaperBook(String ISBN, String title, Integer year, Integer price, int stock) {
        super(ISBN, title, year, price);
        this.stock = stock;
    }
    public void buy(int quantity, String address){
        if(stock < quantity){
            System.out.println("Not enough stock for: " + title);
            return;
        }
        stock -= quantity;
        //Send Paper book to the ShippingService for example:
        //ShippingService.send(this, quantity, address);
        System.out.println("Total Price for " + quantity+  " books of "+ title +": " + price * quantity);
    }
    public boolean shippable(){
        if(stock > 0){return true;}
        else{return false;}
    }
}
