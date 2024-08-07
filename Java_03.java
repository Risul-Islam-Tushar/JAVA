//Write a program that takes a year from user and print whether that year is a leap year or not

import java.util.Scanner;

public class Java_03 {
    public static void main(String[] args) {
        System.out.println("Enter A year : ");
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println("Its a Leap Year");
        }else {
            System.out.println("Its not a Leap Year");
        }

    }
}
