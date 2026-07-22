class Que1{
    public static void main(String[] args){
        int[] arr = {90, 95, 94, 93, 91};
        int sum=0;
        for(int i=0; i<5; i++){
            sum += arr[i];
        }
        System.out.println(sum);
        int avg = sum/5;
        System.out.println(avg);
        int max=arr[0], min=arr[0];
        for(int i=0; i<5; i++){
            if(max<arr[i]){
                max = arr[i];
            }
            if(min>arr[i]){
                min = arr[i];
            }
        }
        System.out.println("Max : "+ max);
        System.out.println("Min : "+ min);
    }
}