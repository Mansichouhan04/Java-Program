//Create a HashMap with 3 product names as keys and their prices as values. Update the price of one product and display the updated map.
import java.util.HashMap;
public class Update_product_price {
    public static void main(String[] args) {
    HashMap<String,Integer>products=new HashMap<>();
    products.put("Laptop",5000);
    products.put("Phone",800);
    products.put("Tablet",500);
    System.out.println("Before update::"+products);
    products.put("Phone",900);
    System.out.println("After update price::"+products);
    }
}
