class Mobile {
    String brand;
    String model;
    int price;

    Mobile(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
        System.out.println();
    }
}

public class Que6 {
    public static void main(String[] args) {
        Mobile m1 = new Mobile("Samsung", "Galaxy S26", 80000);
        Mobile m2 = new Mobile("Apple", "iPhone 15", 100000);

        m1.display();
        m2.display();
    }
}