public class Cart {
    private Product product;

    public void addProduct( Product product ) throws Exception {
        if ( product.getPrice() <= 0 ) {
            throw new Exception( "Product price should be more than 0" );
        }
//        this.product = product;
    }

    public double getTotal() {
        return this.product.getPrice();
    }
}
