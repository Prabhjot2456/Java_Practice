class Student{
    int rollNo;
    String name;
    int marks;

    Student(int r, String n, int m){
        rollNo = r;
        name = n;
        marks = m;
    }

    void display(){
        System.out.println("Roll no : "+ rollNo);
        System.out.println("Name : "+ name);
        System.out.println("Marks : "+ marks);
    }   
}

public class Que4{
    public static void main(String[] args) {
        Student s1 = new Student(123, "Prabh", 90);
        s1.display();
    }
}