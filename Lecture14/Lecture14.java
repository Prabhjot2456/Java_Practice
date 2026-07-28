// Static block : it runs before main function

public class Lecture14{

    // static int a=10;

    // static{
    //     a=10*20;
    // }




    static {
    System.out.println("static block-2");
    }

    static int a = fxn1();

    static {
    System.out.println("static block-1");
    }

    static int fxn1() {
    System.out.println("fxn1()");
    return 0;
    }

    public static void main(String[] args) {
    System.out.println("inside main() : " + a);
    }
}

// here the code will run in sequence (Top to bottom)
// main methood will always execute at the end after static block