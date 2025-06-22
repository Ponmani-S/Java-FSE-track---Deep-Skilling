//Superset Id: 6385480
import java.util.*;

class Product implements Comparable<Product> {
    int productId;
    String productName;
    String category;

    public Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    public int compareTo(Product p) {
        return this.productName.compareTo(p.productName);
    }

    public String toString() {
        return productId + " " + productName + " " + category;
    }
}

class Search {
    public static Product linearSearch(ArrayList<Product> products, String name) {
        for (Product p : products) {
            if (p.productName.equalsIgnoreCase(name)) {
                return p;
            }
        }
        return null;
    }

    public static Product binarySearch(ArrayList<Product> products, String name) {
        int left = 0, right = products.size() - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            int cmp = products.get(mid).productName.compareToIgnoreCase(name);
            if (cmp == 0)
                return products.get(mid);
            else if (cmp < 0)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return null;
    }

    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product(101, "Laptop", "Electronics"));
        products.add(new Product(102, "T-Shirt", "Clothing"));
        products.add(new Product(103, "Keyboard", "Electronics"));
        products.add(new Product(104, "Shoes", "Footwear"));
        products.add(new Product(105, "Phone", "Electronics"));
      
        System.out.println("Linear Search:");
        Product result1 = linearSearch(products, "Keyboard");
        System.out.println(result1 != null ? result1 : "Product not found");
      
        Product result2 = linearSearch(products, "Cloth");
        System.out.println(result2 != null ? result2 : "Product not found");
      
        Collections.sort(products);
      
        System.out.println("\nBinary Search:");
        Product result3 = binarySearch(products, "Keyboard");
        System.out.println(result3 != null ? result3 : "Product not found");
      
        Product result4 = linearSearch(products, "Cloth");
        System.out.println(result4 != null ? result4 : "Product not found");
    }
}
