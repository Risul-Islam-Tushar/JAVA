//Write a program to get a number from the user and print whether it is positive or negative.


import java.util.Scanner;

public class java_01 {
    public static void main(String[] args) {
        System.out.println("Enter Any number: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if (number > 0 ){
            System.out.println("Its a Positive number");
        } else if (number < 0 ) {
            System.out.println("Its a Negative numbe");
        } else {
            System.out.println("Its not a number");
        }
    }
}
