class Person {
    int id;
    String name;

    void setPerson(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class Student extends Person {
    String course;

    void setStudent(String course) {
        this.course = course;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
    }

    public static void main(String[] args) {
        Student s1 = new Student();

        s1.setPerson(1, "Prabh");
        s1.setStudent("AIFT");
        s1.display();
    }
}