/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplications;

import java.util.Scanner;

/**
 *
 * @author Tushar
 */
public class Switch_Example {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int value;
        
        System.out.print("Enter 0 for Bangla, 1 for Urdu, 2 for Hindi :");
        value = input.nextInt();
        
        switch(value){
            case 0:
                System.out.println("Bangla");
                break;
            case 1:
                System.out.println("Urdu");
                break;
            case 2:
                System.out.println("Hindi");
                break;
                
            default:
                System.out.println("You have Entered Wrond Value.");
    }
        
        
        
        
        
        
        
        
        
        
    }
}
