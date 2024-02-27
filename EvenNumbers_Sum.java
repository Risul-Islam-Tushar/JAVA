
package javaapplications;

import java.util.Scanner;

public class EvenNumbers_Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m , n , sum=0;
        
        System.out.println("Enter First Number:");
        m = input.nextInt();
        System.out.println("Enter Second Number:");
        n = input.nextInt();
        for (int i = m; i <= n; i++) {
            if ( i % 2 == 0) {
                sum = sum + i;
            }
            
        }
        System.out.println("Sum Is : "+sum);
    }
}
