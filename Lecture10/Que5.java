class Rectangle {
    int length;
    int width;

    Rectangle() {
        length = 0;
        width = 0;
    }

    Rectangle(int length) {
        this.length = length;
        width = 0;
    }

    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    void display() {
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
    }
}

public class Que5 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(10);
        Rectangle r3 = new Rectangle(10, 5);

        r1.display();
        r2.display();
        r3.display();
    }
}