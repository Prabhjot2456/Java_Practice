// class Employee{
//     int empId;
//     String name;

//     Employee(int empId, String name) {
//         this.empId = empId;
//         this.name = name;
//     }

//     void work(){
//         System.out.println("Employee working");
//     }
// }

// class Developer extends Employee{

//     Developer(int empId, String name) {
//         super(empId, name);
//     }

//     @Override
//     void work(){
//         System.out.println("Developing Software");
//     }

//     void writeCode(){
//         System.out.println("Writing code");
//     }
// }

// class Trainer extends Employee{

//     Trainer(int empId, String name) {
//         super(empId, name);
//     }

//     @Override
//     void work(){
//         System.out.println("Teaching students");
//     }
// }

// public class Que2{
//     public static void main(String[] args) {
//         Developer d = new Developer(1, "Prabh");
//         Trainer t = new Trainer(2, "milan");

//         Employee e;
//         e = d;
//         e.work();
//         if(e instanceof Developer dev) {
//             dev.writeCode();
//         }
//         System.out.println();

//         e = t;
//         e.work();
//         if(e instanceof Developer dev) {
//             dev.writeCode();
//         }
//     }
// }