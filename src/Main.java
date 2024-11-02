public class Main {
    public static void main(String[] args) {
        // Create a new cart
        Cart cart = new Cart();

        // Define products with different prices
        Product sneakers = new Product(10);
        Product tShirt = new Product(20);
        Product eBook = new Product(5);

        // Add products to cart and handle exceptions if any
        try {
            cart.addProduct(sneakers);
            cart.addProduct(tShirt);
            cart.addProduct(eBook);

            // Try to add a product with invalid price to test exception handling
            Product faultyProduct = new Product(0);
            cart.addProduct(faultyProduct);
        } catch (Exception e) {
            System.out.println("Error adding product: " + e.getMessage());
        }

        // Display the total price of all products in the cart
        System.out.println("Total Cart Price: $" + cart.getTotal());
    }
}
