public class ToChar {
    public static void main(String[] args) {
        String myString = "This IS Tushar";
        char[] arr = myString.toCharArray();

        for (char ch : arr){
            System.out.println(ch);
        }

        System.out.println( "Number  of lenth :"+arr.length);
    }
}
