class Product {
    int productId;
    String productName;
    int price;

    Product() {
        productId = 0;
        productName = "Unknown";
        price = 0;
    }

    Product(int productId, String productName, int price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    void display() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
        System.out.println();
    }
}

public class Que9 {
    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product(101, "Laptop", 50000);
        Product p3 = new Product(102, "Mobile Phone", 30000);

        p1.display();
        p2.display();
        p3.display();
    }
}