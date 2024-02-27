/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplications;

import java.util.Scanner;

/**
 *
 * @author Tushar
 */
public class JavaApplications {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
      Scanner input = new Scanner(System.in);  
      char ch;
      
      System.out.print("ENter Any Charecter:");
      ch = input.next().charAt(0);
      
      if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
          System.out.println("Vowel");
      }else{
      System.out.println("Consonent");
    }
    
}
}
