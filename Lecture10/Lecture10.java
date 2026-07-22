// constructir name and class name sholud be same
// constructor have no return type
// constructor overloading : by changing the no of arguments or parameters


// Revesion obj = new Revesion();    Revesion() is a constructor calling without arguments
// obj.fxn();

// default constructor : A default constructor is a constructor automatically provided by the Java compiler

// If you write any constructor yourself, Java does not generate the default constructor.



// class Lecture10{
    
//     public Lecture10(){                          
//         System.out.println("Lecture10()");
//     }

//     public static void main(String[] args) {
//         Lecture10 obj = new Lecture10();
//         obj.fxn();
//     }

//     void fxn(){
//         System.out.println("fxn()");
//     }
// }


// class Lecture10{
//     public Lecture10(){
//         System.out.println("Lecture10()");
//     }
//     public Lecture10(int x){
//         System.out.println("x : "+x);
//     }
//     public static void main(String[] args) {
//         Lecture10 obj = new Lecture10();
//         Lecture10 obj2 = new Lecture10(10);
//         obj.fxn();
//     }
//     void fxn(){
//         System.out.println("fxn()");
//     }
// }


// constructor(act as function) calling should be in stack, and arguments will act as local variables



// public class Lecture10{
    
//     int id;
//     String name;
//     String course;

//     public Lecture10(){}

//     public Lecture10(int a){         // can only receive id, it acts as boiler plate code
//         id = a;
//         name = "";
//         course = "";
//     }

//     public static void main(String[] args) {
//         Lecture10 s1 = new Lecture10();
//         s1.id = 1;
//         s1.name = "prabh";
//         s1.course="CSE";

//         Lecture10 s2 = new Lecture10(2);
//         s2.name = "";
//         s2.course = "";
//     }
// }



// class Lecture10{
//     int id;

//     public Lecture10(int id){                          
//         id = 100;
//     }
//     public static void main(String[] args) {
//         Lecture10 obj = new Lecture10(100);
//         System.out.println(obj.id);                  // 0
//     }
// }



// class Lecture10{
//     int id;

//     public Lecture10(int id){                          
//         this.id = id;
//     }
//     public static void main(String[] args) {
//         Lecture10 obj = new Lecture10(100);
//         System.out.println(obj.id);                
//     }
// }




// Method area : Static global variable, static and non static fxn
// heap : non static global variable

class Lecture10{
    // int a;
    // static int b;

    public static void main(String[] args) {
        Lecture10 obj = new Lecture10(); 
        obj.fxn();
        obj.fxn2();   
        // Lecture10.fxn2();           
    }

    void fxn(){
        System.out.println("fxn() from Lecture10");
    }

    void fxn2(){
        System.out.println("fxn2() from Lecture10");
    }
}

// static = shared memory
// Non Static = not shared(individual) but linked with object 