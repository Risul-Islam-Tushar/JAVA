//Take three numbers from the user and print the greatest number

import java.util.Scanner;

public class JAva_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Three Numbers : ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        if (num1 > num2 && num1 > num3){
            System.out.println("Number 1 Is Bigger");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("Number 2 is Bigger");
        }
        else {
            System.out.println("Number 3 Is Bigger");
        }
    }
}
