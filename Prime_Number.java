
package Package_2;

import java.util.Scanner;

public class Prime_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter Any Intiger:");
        int num = input.nextInt();
        int count = 0;
        
        
        for (int i = 2; i < num; i++) {
            if (num%2 == 0) {
                count++;
                break;
            }
        }
        if (count==0) {
            System.out.println("Prime Number.");
        }else{
            System.out.println("Not A Prime Number.");
        }
        
    }
}
    
