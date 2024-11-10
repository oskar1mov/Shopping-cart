public class Main {
    public static void main(String[] args) throws Exception {
        Groceries apple = new Groceries("Apple", 1.2);
        Cosmetics lipstick = new Cosmetics("Lipstick", 15.5);
        Electronics laptop = new Electronics("Laptop", -200.50); // Некорректная цена

        Cart cart = new Cart();
        cart.addProduct(apple);
        cart.addProduct(lipstick);

        if (laptop.getPrice() > 0) {
            cart.addProduct(laptop);
        } else {
            System.out.println("Error adding product: Invalid price for " + laptop.getProductName());
        }

        System.out.println("Items in Cart:");
        cart.showCart();

        double totalPrice = cart.calculateTotalPrice();
        System.out.println("Final total price: $" + totalPrice);
    }
}
