class Person {
    void showPerson() {
        System.out.println("Person");
    }
}

class Employee extends Person {
    void showEmployee() {
        System.out.println("Employee");
    }
}

class Trainer extends Employee {
    void showTrainer() {
        System.out.println("Trainer");
    }

    public static void main(String[] args) {
        Trainer t = new Trainer();

        t.showPerson();
        t.showEmployee();
        t.showTrainer();
    }
}