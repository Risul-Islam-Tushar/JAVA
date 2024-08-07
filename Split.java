public class Split {
    public static void main(String[] args) {
        String myString = "I Live In Dhaka";

        String words[] = myString.split(" ");

        for (int i=0;i< words.length;i++){
            System.out.println(words[i] );
        }
    }
}