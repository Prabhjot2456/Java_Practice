class Student{
    int rollNo;
    String name;

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    void display(){
        System.out.println("Roll no: "+ rollNo);
        System.out.println("Name: "+ name);
    }
}

class Hosteler extends Student{
    String hostelName;
    int roomNo;

    Hosteler(int rollNo, String name, String hostelName, int roomNo) {
        super(rollNo, name);
        this.hostelName = hostelName;
        this.roomNo = roomNo;
    }

    @Override
    void display() {
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Hostel Name: " + hostelName);
        System.out.println("Room Number: " + roomNo);
    }
}

class DayScholar extends Student{
    int busRouteNo;

    DayScholar(int rollNo, String name, int busRouteNo) {
        super(rollNo, name);
        this.busRouteNo = busRouteNo;
    }

    @Override
    void display() {
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Bus Route Number: " + busRouteNo);
    }
}

public class Que1{
    public static void main(String[] args){
        // Student s1 = new Hosteler(1, "Prabh", "Arch", 832);
        // s1.display();
        // Student s2 = new DayScholar(2, "parth", 15);
        // s2.display();


        Hosteler h = new Hosteler(101, "Prabh", "Arch", 832);
        DayScholar d = new DayScholar(102, "Parth", 12);

        Student s = h;       
        s.display();    

        System.out.println();

        s = d;         
        s.display();    
    }
}