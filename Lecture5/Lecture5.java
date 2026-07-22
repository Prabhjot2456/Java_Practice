// class Lecture5{

//     // Lecture5 obj = new Lecture5();          // in this obj will be cretated in heap
//     int a = 10;
//     public static void main(String[] args){

//     }
// }


// if there are 2 classes in a file then after compilation 2 .class files will be created



// 3/7/26
// 1
// class Lecture5{
//     public static void main(String[] args){
//         int a = 10;
//         int b = 2;
//         System.out.println("Sum : "+(a+b));
//         System.out.println("Diff : "+(a-b));
//         System.out.println("Product : "+(a*b));
//         System.out.println("Quotient : "+(a/b));
//         System.out.println("Remainder : "+(a%b));
//     }
// }


// 2
// class Lecture5{
//     public static void main(String[] args){
//         int a = 5;
//         int b = 6;
//         int temp;
//         temp = a;
//         a = b;
//         b = temp;
//         System.out.println(a); 
//         System.out.println(b);
//     }
// }


// 3
// class Lecture5{
//     public static void main(String[] args){
//         int a = 5;
//         int b = 6;
//         int c = 7;
//         int avg = (a+b+c)/3;
//         System.out.println(avg);
//     }
// }


// 4
// class Lecture5{
//     public static void main(String[] args){
//         int totalMin = 100;
//         int hours = totalMin/60;
//         int min = totalMin%60;
//         System.out.println(hours);
//         System.out.println(min);
//     }
// }


// 5
// class Lecture5{
//     public static void main(String[] args){
//         int num = 5;
//         System.out.println("Square : "+ num*num);
//         System.out.println("Cube : "+ num*num*num);
//     }
// }


// 6
// class Lecture5{
//     public static void main(String[] args){
//         int amt = 1000;
//         System.out.println("Total bill : "+ (amt + (amt*0.18)));
//     }
// }


// 7
// class Lecture5{
//     public static void main(String[] args){
//         int principle = 1000;
//         int rate = 5;
//         int time = 2;
//         System.out.println("Simple interest : "+((principle*rate*time)/100));
//     }
// }


// 8
// class Lecture5{
//     public static void main(String[] args){
//         int sub1 = 95;
//         int sub2 = 90;
//         int sub3 = 92;
//         int sub4 = 93;
//         int sub5 = 91;
//         System.out.println("Percentage : "+ (sub1+sub2+sub3+sub4+sub5)/5);
//     }
// }



// 9
// class Lecture5{
//     public static void main(String[] args){
//         int salary = 50000;
//         int hraPercent = 10;
//         int daPercent = 5;
//         System.out.println("Gross salary : "+ (salary + (hraPercent*salary)/100 + (daPercent*salary)/100));
//     }
// }


// 10
// class Lecture5{
//     public static void main(String[] args){
//         int num = 55;
//         if(num %5 == 0 && num%11 == 0){
//                 System.out.println("Yes");
//         }
//         else{
//             System.out.println("No");
//         }
//     }
// }


// 11
// class Lecture5{
//     public static void main(String[] args){
//         int a = 5;
//         System.out.println("Post-increment : "+ a++);
//         System.out.println("Pre-increment : "+ ++a);
//     }
// }


// 12
// class Lecture5{
//     public static void main(String[] args){
//         int a = 6;
//         int b = 5;
//         System.out.println((a>b) && (b>a));
//         System.out.println((a>b) || (b>a));
//     }
// }


// 13
// class Lecture5{
//     public static void main(String[] args){
//         int a = 6;
//         int b = 5;
//         int largest = (a>b) ? a : b;
//         System.out.println("Largest : "+ largest);
//     }
// }


// 14
// class Lecture5{
//     public static void main(String[] args){
//         int a = 6;
//         System.out.println(a += 5);
//         System.out.println(a -= 5);
//         System.out.println(a *= 5);
//         System.out.println(a /= 5);
//     }
// }


// 15
// class Lecture5{
//     public static void main(String[] args){
//         int a = 5;
//         int b = 6;
//         System.out.println(a>b);
//         System.out.println(a<b);
//         System.out.println(a==b);
//     }
// }



// there is no call by reference in java 



// For each loop
class Lecture5{ 
    public static void main(String[] args){

        // int b = new int[5];    // in java array is an object and it is created in heap memory

        int a[] = {1, 2, 3, 4, 5};
        for(int x : a){
            System.out.println(x);
        }
    }
}