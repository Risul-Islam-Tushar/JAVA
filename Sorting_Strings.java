
package Package_3;

import java.util.Arrays;

public class Sorting_Strings {
    public static void main(String[] args) {
        
        String[] names = {"Tushar","Abir","Kabir","Masud"};
        Arrays.sort(names);
        
        for (int i = 0; i < 4; i++) {
            System.out.print(" "+names[i]);
        }
    }
}
