// this keyword do not work in static
// constructor runs in stack when obj is created in heap
// this : current object or caller object

// class Lecture11{
//     int a;

//     public static void main(String[] args) {
//         Lecture11 obj = new Lecture11(); 
//         obj.fxn();
//     }


//     // void fxn(this) 
//     void fxn(){
//         System.out.println("fxn() "+a);    // (this.a) because refrence of heap goes in stack as well as this 

//         fxn2();    // this.fxn2()
//     }

//     void fxn2(){
//         System.out.println("fxn2()");
//     }
// }



// constructor chaining is used to remove boiler plate code