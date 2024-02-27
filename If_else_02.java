package JavaCodes;

import java.util.Scanner;

public class If_else_02 {
	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		int value;
		
		
		System.out.print("Enter Any Number From 1 -to- 9:");
		value = input.nextInt();
		
		
		if(value == 1) {
			System.out.print("One");
		}
		else if(value == 2){
			System.out.print("Two");
		}
		else if(value == 3){
			System.out.print("Three");
		}
		else if(value == 4){
			System.out.print("Four");
		}
		else if(value == 5){
			System.out.print("Five");
		}
		else if(value == 6){
			System.out.print("Six");
		}
		else if(value == 7){
			System.out.print("Seven");
		}
		else if(value == 8){
			System.out.print("Eight");
		}
		else if(value == 9){
			System.out.print("Nine");
		}
		else {
			System.out.print("RIP");
		}
	}
}
