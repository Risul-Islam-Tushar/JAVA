
// Write a program to calculate GPA and find grade

import java.util.Scanner;

public class Java_05 {
    public static void main(String[] args) {
        System.out.println("Enter Yor Marks : ");
        Scanner input = new Scanner(System.in);
        int marks = input.nextInt();

        if (marks >= 80 && marks <= 100){
            System.out.println("A+ And GPA is 5.00");
        } else if (marks >= 70 && marks <= 79) {
            System.out.println("A And GPA is 4.00");
        } else if (marks >= 60 && marks <= 69) {
            System.out.println("A- And GPA is 3.50");
        }else if (marks >= 50 && marks <= 59) {
            System.out.println("B And GPA is 3.00");
        }else if (marks >= 40 && marks <= 49) {
            System.out.println("C And GPA is 2.00");
        }else if (marks >= 33 && marks <= 39) {
            System.out.println("D And GPA is 1");
        }
        else {
            System.out.println("Failed");
        }
    }
}
