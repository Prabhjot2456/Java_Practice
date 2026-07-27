public class Calculator{

    static int add(int a, int b){
        return a + b;
    }

    static int diff(int a, int b){
        return a - b;
    }

    static int multiply(int a, int b){
        return a * b;
    }

    static double divide(int a, int b){
        return (double)a/b;
    }
    public static void main(String[] args) {
        System.out.println("Addition: " + Calculator.add(10, 5));
        System.out.println("Subtraction: " + Calculator.diff(10, 5));
        System.out.println("Multiplication: " + Calculator.multiply(10, 5));
        System.out.println("Division: " + Calculator.divide(10, 5));
    }
}