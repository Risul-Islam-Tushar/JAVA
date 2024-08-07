//Write a program to check if inputted letter is small or capital

import java.util.Scanner;

public class Java_04 {
    public static void main(String[] args) {
        System.out.println("Enter A Character : ");
        Scanner Char = new Scanner(System.in);
        char ch = Char.next().charAt(0);

        if (ch >= 'A' && ch <= 'Z')
            System.out.println("\n" + ch + " is an UpperCase character");

        else if (ch >= 'a' && ch <= 'z')
            System.out.println("\n" + ch + " is an LowerCase character" );

        else
            System.out.println("\n" + ch + " is not an alphabetic character" );
    }
}
