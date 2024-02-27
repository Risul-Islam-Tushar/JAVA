package JavaCodes;

public class Increment {
 public static void main (String[] args) {
	 
	 int x = 30, j =40;
	 
	 int y,z;
	
	 
//	 INCREMENT-------------------
	 
	 y = ++x;  //Pre Increment
	 System.out.println("y=" +y);
	 
	 
	 y = x++; //Post Increment
	System.out.println("y = "+y);
	
	y = x;
	System.out.println("y = "+y);
	
	
//	DECREMENT--------------------
	
	z = --j;  //Pre Increment
	 System.out.println("z=" +z);
	 
	 
	 z = j--; //Post Increment
	System.out.println("z = "+z);
	
	z = j;
	System.out.println("z = "+z);
	 
	 
 }
}
