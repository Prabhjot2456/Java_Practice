// Data types

// class Lecture2
// {
//     public static void main(String args[])
//     {
//         int a = 10;                  // local variable should be initialized before use
//         System.out.println(a);
//     }
// }

// 1. local variable should be initialized before use
// 2. non static variable can not be execute in static method
// 3. static variable can be execute in static method


// class Lecture2
// {
//     static byte a;
//     static short b;
//     static int c;
//     static long d;
//     static float e;
//     static double f;
//     static boolean g;
//     static char h;

//     public static void main(String[] args) {
//         System.out.println(a);
//         System.out.println(b);
//         System.out.println(c);
//         System.out.println(d);
//         System.out.println(e);
//         System.out.println(f);
//         System.out.println(g);
//         System.out.println(h);
//     }
// }


// class Lecture2
// {
//     public static void main(String args[])
//     {
//         int a = 10;                  
//         if(a%2 == 0){
//             System.out.println("Even");
//         }
//         else{
//             System.out.println("Odd");
//         }
//     }
// }


// class Lecture2
// {
//     public static void main(String args[])
//     {
//         int a = 10;
//         int b = 50;
//         int c = 20;

//         if(a>b && a>c){
//             System.out.println("A is greatest");
//         }
//         else if(b>c){
//             System.out.println("B is greatest");
//         }
//         else{
//             System.out.println("C is greatest");
//         }
//     }
// }


// class Lecture2
// {
//     public static void main(String args[])
//     {
//         int a = 10;                  
//         int b = 50;
//         int c = 40;
//         int greatest = (a>b && a>c) ? a : (b>c) ? b : c;
//         System.out.println(greatest);
//     }
// }



// Class and object
class Lecture2
{
    
    // data member 
    // int a = 10;    // global var / instance var

    // member function
    // void fxn()             // NR NA
    // {}

    // void fxn(intx, int y)   // NR WA
    // {}



    // Data member (Instance Variable)
    int a = 10;

    // Member Function (Instance Method)
    void fxn() {
        System.out.println("Hello");
    }

    public static void main(String args[]) {

        // Create an object of the class
        Lecture2 obj = new Lecture2();              // data type of obj is class

        // Call the instance method using the object
        obj.fxn();

        // Print the object reference
        System.out.println(obj);

        // Print the instance variable
        System.out.println(obj.a);
    }
}