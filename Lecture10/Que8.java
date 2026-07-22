class Car{
    String company;
    String model;
    int year;

    Car(){
        company = "unknown";
        model = "unknown";
        year = 0;
    }

    Car(String company, String model, int year){
        this.company = company;
        this.model = model;
        this.year = year;
    }

    void display(){
        System.out.println("Company: " + company);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println();
    }
}

public class Que8{
    public static void main(String args[]){
        Car c1 = new Car();
        Car c2 = new Car("Land Rover", "Defender", 2024);

        c1.display();
        c2.display();
    }
}