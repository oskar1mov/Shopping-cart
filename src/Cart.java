import java.util.ArrayList;
import java.util.List;

public class Cart {
    private final List<Product> products = new ArrayList<>();

    public void addProduct(Product product) throws Exception {
        if ( product.getPrice() <= 0 ) {
            throw new Exception("Product price should be greater than 0");
        }
        this.products.add(product);
    }

    public double getTotal() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }
}
