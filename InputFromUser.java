package JavaCodes;

import java.util.Scanner;

public class InputFromUser {
public static void main (String[] args) {
	Scanner input = new Scanner(System.in);
	String name;
	
	System.out.print("Enter Your Name:");
	name = input.nextLine();
	
	System.out.println("Wlcome :" +name);
}
}
