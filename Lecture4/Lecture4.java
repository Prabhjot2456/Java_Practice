// class Lecture4{
//     public static void main(String args[]){
//         Lecture4 obj = new Lecture4();         // obj is of class type also it will return string object
//         System.out.println(obj);
//     }
// }



// class Lecture4{

//     int id;
//     int age;

//     public static void main(String args[]){
//         Lecture4 std1 = new Lecture4();
//         Lecture4 std2 = new Lecture4();

//         std1.id = 1;
//         std1.age = 19;

//         std2.id = 2;
//         std2.age = 20;

//         System.out.println(std1.id);
//         System.out.println(std1.age);

//         System.out.println(std2.id);
//         System.out.println(std2.age);
//     } 
// }



// class Lecture4{
//     public static void main(String args[]){

//         int a = 10;

//         Lecture4 obj = new Lecture4();
//         obj.fxn1();
//         obj.fxn1(a);
//     } 

//     void fxn1(){
//         System.out.println("Hello from fxn1()");
//     }

//     void fxn1(int a){             // we have to give some variation in the function name or parameters to make it overloaded so that it can be differentiated from the other function
//         System.out.println("Hello from fxn1(int) : "+a);
//     }
// }



// overloading main method
// class Lecture4{
//     public static void main(String[] args) {            // by changing arguments
         
//     }

//     public static void main(String[] args, int x) {
        
//     }
// }
// agar arguments same hain to data type change karna hai taki variation aaye



// Questions
// 1
class Lecture4 {
    
    public static void main(String args[]) {

        int salary = 50000;
        int final_salary;
        float bonus;

        bonus = salary * 0.1f;
        final_salary = salary + (int)bonus;
        System.out.println("Bonus : " + bonus);
        System.out.println("Final Salary : " + final_salary);
    }
}