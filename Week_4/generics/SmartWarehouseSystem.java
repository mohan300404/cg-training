
package Week_4.generics;;

import java.util.ArrayList;
import java.util.List;

abstract class WarehouseItem {
    private String name;

    public WarehouseItem(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract String getDetails();
}

class Electronics extends WarehouseItem {
    private String brand;

    public Electronics(String name, String brand) {
        super(name);
        this.brand = brand;
    }

    @Override
    public String getDetails() {
        return "Electronics: " + getName() + ", Brand: " + brand;
    }
}

class Groceries extends WarehouseItem {
    private String expiryDate;

    public Groceries(String name, String expiryDate) {
        super(name);
        this.expiryDate = expiryDate;
    }

    @Override
    public String getDetails() {
        return "Groceries: " + getName() + ", Expiry: " + expiryDate;
    }
}

class Furniture extends WarehouseItem {
    private String material;

    public Furniture(String name, String material) {
        super(name);
        this.material = material;
    }

    @Override
    public String getDetails() {
        return "Furniture: " + getName() + ", Material: " + material;
    }
}

class Storage<T extends WarehouseItem> {
    private List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public List<T> getItems() {
        return items;
    }
}

class WarehouseUtil {
    public static void displayItems(List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) {
            System.out.println(item.getDetails());
        }
    }
}

public class SmartWarehouseSystem {
    public static void main(String[] args) {
        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Laptop", "Dell"));
        electronicsStorage.addItem(new Electronics("Phone", "Samsung"));

        Storage<Groceries> groceryStorage = new Storage<>();
        groceryStorage.addItem(new Groceries("Apple", "2025-01-01"));
        groceryStorage.addItem(new Groceries("Milk", "2024-05-01"));

        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("Chair", "Wood"));
        furnitureStorage.addItem(new Furniture("Desk", "Metal"));

        System.out.println("=== Electronics ===");
        WarehouseUtil.displayItems(electronicsStorage.getItems());

        System.out.println("\n=== Groceries ===");
        WarehouseUtil.displayItems(groceryStorage.getItems());

        System.out.println("\n=== Furniture ===");
        WarehouseUtil.displayItems(furnitureStorage.getItems());
    }
}
