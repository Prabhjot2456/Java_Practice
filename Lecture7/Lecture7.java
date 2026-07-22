
class Lecture7{
    public static void main(String[] args) {
        
        // Scanner scanner = new Scanner(System.in);
        // scanner.close();
        // Scanner scanner1 = new Scanner(System.in);     // can't use this



        // Lecture7 obj = new Lecture7();        // when fxn is non static
        // obj.fxn();


        fxn();                        
        // Lecture7.fxn();               // static method can be accessed by class directly
        // obj.fxn();


        System.out.println();
        
    }

    static void fxn(){
        System.out.println("Hi");
    }
    
}