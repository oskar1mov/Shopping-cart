public class Electronics extends Product{
    public Electronics(String productName, double price) {
        super(productName, price);
    }
    @Override
    public void displayInfo(){
        System.out.println("Electronics" + getProductName() + "| Price" + getPrice());
    }
}
