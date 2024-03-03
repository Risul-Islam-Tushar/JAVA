
package Package_2;

import java.util.Scanner;

public class Array_01_Sum_Average {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        double[] number = new double[5];
        double sum = 0; 
        
        
        System.out.println("Enter 5 numbers:");
        
        for (int i = 0; i < 5; i++) {
            number[i] = input.nextDouble();
        }
        for (int i = 0; i <5; i++) {
            sum = sum + number[i];
        }
        System.out.println(sum);  
        
        double avg = sum/5;
        System.out.println(avg);
    }
 
}
