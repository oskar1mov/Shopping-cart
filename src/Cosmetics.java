public class Cosmetics extends Product{
    public Cosmetics(String productName, double price) {
        super(productName, price);
    }
    @Override
    public void displayInfo() {
        System.out.println("Cosmetics: " + getProductName() + " | Price: " + getPrice());
    }
}
