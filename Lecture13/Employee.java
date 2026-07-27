public class Employee{
    int id;
    String name;
    static String company="Google";

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display(){
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Company: " + company);
        System.out.println();
    }
    
    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Prabhjot");
        Employee e2 = new Employee(102, "Rahul");

        System.out.println("Before changing company:");
        e1.display();
        e2.display();

        Employee.company = "Microsoft";
        System.out.println("After changing company:");
        e1.display();
        e2.display();
    }
}