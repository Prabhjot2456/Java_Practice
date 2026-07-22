public class pyramidQue6 {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            // Ascending letters
            for (char ch = 'A'; ch <= ('A' + i - 1); ch++) {
                System.out.print(ch + " ");
            }
            // Descending letters
            for (char ch = (char)('A' + i - 2); ch >= 'A'; ch--) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}




//         A 
//       A B A 
//     A B C B A 
//   A B C D C B A 