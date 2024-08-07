
package Inheritance;

public class Teacher extends Person {
    String qualification;
    
    void displayInfo2(){
        System.out.println("Name :"+name);
        System.out.println("Age :"+age);
        System.out.println("Qualification :"+qualification);
    }
}
