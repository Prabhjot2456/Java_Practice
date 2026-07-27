import java.util.Scanner;

public class Que1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1= sc.nextLine().toLowerCase();

        int[] result = countVowelConsonant(s1);
        System.out.println("Vowels: " + result[0]);
        System.out.println("Consonants: " + result[1]);
    }

    static int[] countVowelConsonant(String s1) {
        int c_count = 0, v_count = 0;
        int[] arr = new int[2];
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u') {
                v_count++;
            } else {
                c_count++;
            }
        }
        arr[0]=v_count; arr[1]=c_count;
        return arr;
    }
}