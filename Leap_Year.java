package JavaCodes;

import java.util.Scanner;

public class LeapYear {
public static void main (System[] args) {
		
		
		Scanner input = new Scanner(System.in);
		double year;
		
		
		System.out.print("Enter Any Year:");
		year = input.nextDouble();
		
		
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.print("Its a Leap Year");
		}
		else {
			System.out.print("Sorry!!!! Its Not a Leap Year");
		}
	}
}
