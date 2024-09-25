import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class GroceryItem {
    String name;
    double price;
    String description;

    public GroceryItem(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    @Override
    public String toString() {
        return name + ": $" + price + " - " + description;
    }
}

class CartItem {
    GroceryItem item;
    int quantity;

    public CartItem(GroceryItem item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return item.name + " (x" + quantity + ") - $" + (item.price * quantity);
    }
}

 class GroceryManagementSystem {
    private static final Scanner scanner = new Scanner(System.in);
    private static final ArrayList<GroceryItem> items = new ArrayList<>();
    private static final HashMap<String, CartItem> cart = new HashMap<>();

    public static void main(String[] args) {
        initializeItems();
        while (true) {
            System.out.println("\nGrocery Management System");
            System.out.println("1. Browse Grocery Items");
            System.out.println("2. Search for Items");
            System.out.println("3. Add Items to Cart");
            System.out.println("4. View Cart");
            System.out.println("5. Remove Items from Cart");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    browseItems();
                    break;
                case 2:
                    searchItems();
                    break;
                case 3:
                    addItemToCart();
                    break;
                case 4:
                    viewCart();
                    break;
                case 5:
                    removeItemFromCart();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void initializeItems() {
        items.add(new GroceryItem("Apple", 0.99, "Fresh and juicy apples."));
        items.add(new GroceryItem("Bread", 2.49, "Whole grain bread."));
        items.add(new GroceryItem("Milk", 1.29, "1 gallon of milk."));
        items.add(new GroceryItem("Eggs", 2.99, "A dozen eggs."));
        items.add(new GroceryItem("Cheese", 4.49, "Cheddar cheese."));
    }

    private static void browseItems() {
        System.out.println("\nAvailable Grocery Items:");
        for (GroceryItem item : items) {
            System.out.println(item);
        }
    }

    private static void searchItems() {
        System.out.print("Enter the item name or category to search: ");
        String query = scanner.nextLine().toLowerCase();

        System.out.println("\nSearch Results:");
        for (GroceryItem item : items) {
            if (item.name.toLowerCase().contains(query) || item.description.toLowerCase().contains(query)) {
                System.out.println(item);
            }
        }
    }

    private static void addItemToCart() {
        System.out.print("Enter the name of the item to add to cart: ");
        String name = scanner.nextLine();

        GroceryItem selectedItem = null;
        for (GroceryItem item : items) {
            if (item.name.equalsIgnoreCase(name)) {
                selectedItem = item;
                break;
            }
        }

        if (selectedItem == null) {
            System.out.println("Item not found.");
            return;
        }

        System.out.print("Enter the quantity: ");
        int quantity = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        if (quantity <= 0) {
            System.out.println("Quantity must be greater than zero.");
            return;
        }

        CartItem cartItem = cart.get(name);
        if (cartItem != null) {
            cartItem.quantity += quantity;
        } else {
            cartItem = new CartItem(selectedItem, quantity);
            cart.put(name, cartItem);
        }

        System.out.println("Added " + quantity + " of " + name + " to the cart.");
    }

    private static void viewCart() {
        if (cart.isEmpty()) {
            System.out.println("Your cart is empty.");
            return;
        }

        System.out.println("\nYour Cart:");
        double totalCost = 0.0;
        for (CartItem cartItem : cart.values()) {
            System.out.println(cartItem);
            totalCost += cartItem.item.price * cartItem.quantity;
        }
        System.out.println("Total Cost: $" + totalCost);
    }

    private static void removeItemFromCart() {
        System.out.print("Enter the name of the item to remove from cart: ");
        String name = scanner.nextLine();

        CartItem cartItem = cart.get(name);
        if (cartItem == null) {
            System.out.println("Item not found in cart.");
            return;
        }

        System.out.print("Enter the quantity to remove: ");
        int quantity = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        if (quantity <= 0) {
            System.out.println("Quantity must be greater than zero.");
            return;
        }

        if (quantity >= cartItem.quantity) {
            cart.remove(name);
            System.out.println("Removed all of " + name + " from the cart.");
        } else {
            cartItem.quantity -= quantity;
            System.out.println("Removed " + quantity + " of " + name + " from the cart.");
        }
    }
}

