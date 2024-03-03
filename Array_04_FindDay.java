
package Package_2;

import java.util.Scanner;

public class Array_04_FindDay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any Number From 1 to 7");
        int a = input.nextInt();
        
        String[] weekend = {"Saturday","Sunday","Monday","Tuesday","Wednesday","Thirsday","Friday"};
        System.out.println(weekend[a-1]);
    }
}
