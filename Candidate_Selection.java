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
public class Candidate_Selection {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        char question1,question2;
        
        System.out.println("Do you Know JS:");
        question1 = input.next().charAt(0);
        
        System.out.println("Do you Know HTML:");
        question2 = input.next().charAt(0);
        
        
        if(question1=='y' && question2=='y'){
            System.out.println("You are Selected");
        }
        else if(question1=='Y' && question2=='Y'){
            System.out.println("You are Selected");
        }else{
            System.out.println("Try Again Next Time");
        }
    }
}
