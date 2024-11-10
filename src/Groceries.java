public class Groceries extends Product {

    public Groceries( String productName, double price ) {
        super(productName, price);
    }

    @Override
    public void displayInfo() {
        System.out.println("Groceries: " + getProductName() + " | Price: " + getPrice());
    }
}
