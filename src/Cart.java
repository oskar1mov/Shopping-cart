import java.util.ArrayList;

public class Cart {
    private Product product;
    private ArrayList <Product> items;

    public Cart(){
        this.items = new ArrayList();
    }

    public void addProduct( Product product ) throws Exception {
        if ( product.getPrice() <= 0 ) {
            throw new Exception( "Product price should be more than 0" );
        }
       items.add(product);
    }

    //Method for showing items in Cart
    public void showCart(){
        if(items.isEmpty()){
            System.out.println("Cart is empty");
        }
        else{
            for (Product product : items) {
                System.out.println(product);
            }
        }
    }

    public double calculateTotalPrice() {
        double totalPrice = 0.0;
        for (Product product : items) {
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }

    // TODO impl removeProduct
    // TODO cleanup Main and set things up properly
    // TODO bonus: test coverage for Cart

}
