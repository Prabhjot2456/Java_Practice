import java.util.Scanner;

class Que7{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the element you want to search : ");
        int x = sc.nextInt();

        boolean found=false;
        for(int i=0; i<n; i++){
            if(arr[i] == x){
                found = true;
                break;
            }
        
        }
        if(found){
            System.out.println("Element found");
        }
        else{
            System.out.println("Not found");
        }
    }
}