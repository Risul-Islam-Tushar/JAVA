package JavaCodes;

import java.util.Scanner;

public class CalculateArea {
public static void main (String[] args) {
	Scanner input = new Scanner(System.in);
	double base,height,area;
	
	System.out.print("Enter Base Value:");
	base = input.nextDouble();
	
	System.out.print("Enter Height Value:");
	height = input.nextDouble();
	
	area = 0.5 * base * height;
	System.out.println("Total Area is:" +area);
}
}
