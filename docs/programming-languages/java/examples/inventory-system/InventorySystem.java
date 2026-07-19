// Inventory Management System
import java.util.*;

public class InventorySystem {
    public static void main(String[] args) {
        Map<String, Integer> inventory = new HashMap<>();
        inventory.put("Laptops", 15);
        inventory.put("Keyboards", 50);

        System.out.println("=== Warehouse Inventory ===");
        inventory.forEach((item, qty) -> System.out.println(item + ": " + qty + " units"));
    }
}
