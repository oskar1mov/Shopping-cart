public class Main {
    public static void main(String[] args) {
        Cart firstShoppersCart = new Cart();
        Product pairOfSneakers = new Product(10);
        try {
            firstShoppersCart.addProduct( pairOfSneakers );
        } catch (Exception e) {
            System.out.println("An exception happened while adding a product to the cart");
        }
        System.out.println( firstShoppersCart.getTotal() );


        // exception handling
        // cart
        // add product
            // exception handling
        // get total price
            // ex handling
        // get cart content
            // all good


        // inheritance
        // product - price
            // -> physical
            // -> virtual (online course)
    }
}