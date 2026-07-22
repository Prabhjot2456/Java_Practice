class Employee {
    int id;
    String name;

    Employee() {
        id = 101;
        name = "Rahul";
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}

public class QUe2 {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.display();
    }
}