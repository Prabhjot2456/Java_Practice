class Lecture3{

    // Data Member / global var / instance var
    int a = 10;

    // Member function
    void fxn(){
        int x = 20;
        System.out.println("Hello fxn() " +x);
    }

    public static void main(String args[]){
        Lecture3 obj = new Lecture3();
        obj.fxn();
        System.out.println(obj.a);         // a was non static so it goes in heap and because of new Lecture3() which was also in heap so it can be accessed by obj.a
    }



    // public static void main(String args[]){
    //     int a;
    //     a = 10;
    //     Lecture3 obj;
    //     obj = new Lecture3();
    // }




    // void printStudentData(String name, int rollNo, String branch){
    //     System.out.println("Name: " +name);
    //     System.out.println("Roll No: " +rollNo);
    //     System.out.println("Branch: " +branch);
    // }
    // public static void main(String args[]){
    //     String name = "Prabh";
    //     int rollNo = 1234;
    //     String branch = "CSE AIFT";
    //     Lecture3 obj = new Lecture3();
    //     obj.printStudentData(name, rollNo, branch);
    // }
}