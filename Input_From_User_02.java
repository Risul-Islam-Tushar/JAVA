package JavaCodes;

import java.util.Scanner;

public class InputFromUser_02 {
public static void main (String [] args) {
	Scanner input = new Scanner (System.in);
		int id;
	Scanner input02 = new Scanner(System.in);
			String title;
	Scanner input03 = new Scanner(System.in);
	    double price;
	    
	    
	    System.out.print("Enter Product Id:");
	    id = input.nextInt();
	    System.out.print("Enter Product Title:");
	    title = input02.nextLine();
	    System.out.print("Enter Product Price:");
	    price = input03.nextFloat();
	    
	    System.out.println("id =" +id );
	    System.out.println("Title is=" +title );
	    System.out.println("Price is =" +price );
}
}
