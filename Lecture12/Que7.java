public class Que7 {
    public static void main(String[] args) {
        String str = "JaVaProGram";

        int uppercase = 0;
        int lowercase = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                uppercase++;
            } 
            else if (ch >= 'a' && ch <= 'z') {
                lowercase++;
            }
        }
        System.out.println("Uppercase : " + uppercase);
        System.out.println("Lowercase : " + lowercase);
    }
}