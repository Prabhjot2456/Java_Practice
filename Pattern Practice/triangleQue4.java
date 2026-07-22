class triangleQue4{
    public static void main(String[] args) {
        int n = 4;
        for(int i=1; i<=n; i++){
            int first = i*(i+1)/2;

            for(int j = first; j >= first-i+1; j--){
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }
}




// 1 
// 3 2 
// 6 5 4 
// 10 9 8 7 