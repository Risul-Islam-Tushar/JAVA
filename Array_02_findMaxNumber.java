
package Package_2;

import java.util.Scanner;

public class Array_02_findMaxNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double[] number = new double[5];
        
        System.out.println("Enter 5 values:");
        
        
        for (int i = 0; i < 5; i++) {
         number[i] = input.nextDouble();
        }
        
        double max = number[0];
        for (int i = 1; i < 5; i++) {
            if (max<number[i]) {
                max = number[i];
            }
        }
        System.out.println(max);
    }
}
