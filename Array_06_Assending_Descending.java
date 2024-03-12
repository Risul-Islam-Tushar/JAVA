
package Package_3;

import java.util.Arrays;

public class Array_06_Assending_Descending {
    public static void main(String[] args) {
        int[] numbers = {10,37,11,12,70};
        Arrays.sort(numbers);
        
        System.out.print("Ascending :");
        for (int i = 0; i < 5; i++) {
            System.out.print(" "+numbers[i]);
        }
        System.out.println();
        System.out.print("Descending :");
          
        
        for (int i = 4; i >= 0; i--) {
            System.out.print(" "+numbers[i]);
        }
    }
}
