
import java.util.ArrayList;
import java.util.List;

interface BookCategory {}
interface ClothingCategory {}
interface GadgetCategory {}

class Product<T> {
    private String name;
    private double price;
    private T category;

    public Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public T getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void applyDiscount(double percentage) {
        this.price -= this.price * (percentage / 100);
    }

    public String toString() {
        return name + " (" + category.getClass().getSimpleName() + ") - $" + price;
    }
}

class Fiction implements BookCategory {
    public String toString() {
        return "Fiction";
    }
}

class NonFiction implements BookCategory {
    public String toString() {
        return "NonFiction";
    }
}

class MenWear implements ClothingCategory {
    public String toString() {
        return "MenWear";
    }
}

class WomenWear implements ClothingCategory {
    public String toString() {
        return "WomenWear";
    }
}

class Smartphones implements GadgetCategory {
    public String toString() {
        return "Smartphones";
    }
}

class Laptops implements GadgetCategory {
    public String toString() {
        return "Laptops";
    }
}

class MarketplaceUtil {
    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        product.applyDiscount(percentage);
    }

    public static void displayCatalog(List<? extends Product<?>> catalog) {
        for (Product<?> p : catalog) {
            System.out.println(p);
        }
    }
}

public class DynamicMarketplace {
    public static void main(String[] args) {
        List<Product<?>> catalog = new ArrayList<>();

        catalog.add(new Product<>("The Great Gatsby", 15.99, new Fiction()));
        catalog.add(new Product<>("Science for Everyone", 22.50, new NonFiction()));
        catalog.add(new Product<>("Men's T-Shirt", 10.00, new MenWear()));
        catalog.add(new Product<>("Women's Dress", 35.00, new WomenWear()));
        catalog.add(new Product<>("iPhone 14", 999.99, new Smartphones()));
        catalog.add(new Product<>("MacBook Air", 1299.00, new Laptops()));

        System.out.println("=== Catalog Before Discount ===");
        MarketplaceUtil.displayCatalog(catalog);

        for (Product<?> product : catalog) {
            MarketplaceUtil.applyDiscount(product, 10);
        }

        System.out.println("\n=== Catalog After 10% Discount ===");
        MarketplaceUtil.displayCatalog(catalog);
    }
}
