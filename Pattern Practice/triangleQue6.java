class triangleQue6{
    public static void main(String[] args) {
        int n = 4;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            int first = i*(i+1)/2;
            for(int j=first; j>=first-i+1; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}




//    1
//   32
//  654
// 10987