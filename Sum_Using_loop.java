
package javaapplications;

import java.util.Scanner;

public class Sum_Using_loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m,n;
        int sum = 0;
        
        System.out.println("Entre first value:");
        m = input.nextInt();
        
        System.out.println("Enter Second value:");
        n = input.nextInt();
        
        for (int i = m; i < n; i++) {
            sum = sum + i;
        }
        System.out.println("Sum = "+sum);
    }
}
