public class EBook extends Book {
    private String fileType;
    public EBook(String ISBN, String title, Integer year, Integer price, String fileType) {
        super(ISBN, title, year, price);
        this.fileType = fileType;
    }
    public void buy(int quantity, String email){
        //Send EBook to MailService for example:
        //MailService.send(this, quantity, email););
        System.out.println("Total Price for "+title +": " + price * quantity);
    }
    public boolean shippable(){
        return true;
    }
}
