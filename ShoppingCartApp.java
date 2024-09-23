import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingCartApp {

    // Product class definition
    static class Product {
        private String name;
        private double price;

        public Product(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }

        @Override
        public String toString() {
            return name + ": $" + price;
        }
    }

    // Cart class definition
    static class Cart {
        private ArrayList<Product> products = new ArrayList<>();

        public void addProduct(Product product) {
            products.add(product);
        }

        public void removeProduct(Product product) {
            products.remove(product);
        }

        public double getTotal() {
            double total = 0;
            for (Product p : products) {
                total += p.getPrice();
            }
            return total;
        }

        public void printCart() {
            for (Product p : products) {
                System.out.println(p);
            }
            System.out.println("Total: $" + getTotal());
        }
    }

    // User class definition
    static class User {
        private String username;
        private Cart cart;

        public User(String username) {
            this.username = username;
            this.cart = new Cart();
        }

        public String getUsername() {
            return username;
        }

        public Cart getCart() {
            return cart;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User user = new User("JohnDoe"); // Example user

        // Sample products
        Product product1 = new Product("Laptop", 999.99);
        Product product2 = new Product("Headphones", 199.99);
        Product product3 = new Product("Mouse", 29.99);

        // Adding products to cart
        user.getCart().addProduct(product1);
        user.getCart().addProduct(product2);
        user.getCart().addProduct(product3);

        // Print user cart
        System.out.println("User: " + user.getUsername());
        System.out.println("Your Cart:");
        user.getCart().printCart();

        // Example interaction
        System.out.println("Do you want to remove an item from the cart? (yes/no)");
        String response = scanner.nextLine();
        if (response.equalsIgnoreCase("yes")) {
            System.out.println("Enter product name to remove:");
            String productName = scanner.nextLine();
            Product productToRemove = null;
            for (Product p : user.getCart().products) {
                if (p.getName().equalsIgnoreCase(productName)) {
                    productToRemove = p;
                    break;
                }
            }
            if (productToRemove != null) {
                user.getCart().removeProduct(productToRemove);
                System.out.println(productName + " removed from cart.");
            } else {
                System.out.println("Product not found.");
            }
            System.out.println("Updated Cart:");
            user.getCart().printCart();
        }

        scanner.close();
    }
}
