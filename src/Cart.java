import java.util.ArrayList;

public class Cart {
    private Product product;
    private ArrayList <Product> items;

    public void addProduct( Product product ) throws Exception {
        if ( product.getPrice() <= 0 ) {
            throw new Exception( "Product price should be more than 0" );
        }
       items.add(product);
    }

    // TODO fix add product to peroperly implement the addition
    // TODO impl removeProduct
    // TODO cleanup comments
    // TODO cleanup Main and set things up properly
    // TODO bonus: test coverage for Cart

    public double getTotal() {
        return this.product.getPrice();
    }
}
