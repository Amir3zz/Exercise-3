import java.util.ArrayList;

public class Inventory {
    private ArrayList<Item> items;

    // Constructor
    public Inventory() {
        this.items = new ArrayList<>(); // Initialize the items list
    }

    // Method to add an item to the inventory
    public void addItem(Item item) {
        items.add(item);
        System.out.println(item.getName() + " has been added to the inventory.");
    }

    // Method to remove an item from the inventory
    public void removeItem(Item item) {
        if (items.contains(item)) {
            items.remove(item);
            System.out.println(item.getName() + " has been removed from the inventory.");
        } else {
            System.out.println("Error: " + item.getName() + " not found in the inventory.");
        }
    }

    // Method to check if an item exists in the inventory
    public boolean hasItem(Item item) {
        if (items.contains(item)) {
            return true;
        } else {
            System.out.print("Item does not exist so ");
            return false;
        }
    }

    // Method to display all items in the inventory
    public void displayItems() {
        if (items.isEmpty()) {
            System.out.println("The inventory is empty.");
        } else {
            System.out.println("Inventory items:");
            for (Item item : items) {
                System.out.println("- " + item.getName());
            }
        }
    }

    // Method to get the total number of items
    public int getItemCount() {
        return items.size();
    }
}
