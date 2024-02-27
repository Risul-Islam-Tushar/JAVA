
package javaapplications;

import java.util.Scanner;

public class Find_Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number,fact= 1;
        
        System.out.println("Enter Any number");
        number = input.nextInt();
        
        for (int i = 1; i <= number; i++) {
            fact = fact*i;
        }
        System.out.println(fact);
    }
}
