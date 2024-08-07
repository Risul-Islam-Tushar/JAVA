import java.util.Scanner;

public class second {
   public static void main (String[] args){
       Scanner input = new Scanner(System.in);
       System.out.println("Enter First Value");
       int number1 = input.nextInt();
       System.out.println("Enter Second Value");
       int number2 = input.nextInt();

       int sum = number1+number2;
       System.out.println(sum);
   }
}
