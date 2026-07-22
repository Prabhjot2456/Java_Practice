class Que8{
    public static void main(String[] args) {
        String s1 = "Radar";
        String str = s1.toLowerCase();
        if(str.charAt(0) == str.charAt(str.length()-1)){
            System.out.println("First and last characters are same");
        }
        else{
            System.out.println("Not same");
        }
    }
}