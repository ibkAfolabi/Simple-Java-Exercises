/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cufocsolutions;

import java.util.Scanner;

/**
 *
 * @author Ibukun
 */
public class storeScore {
    public static void main(String[] args) {
    int no_of_students, i;
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the number of students: ");
    no_of_students = input.nextInt();
    int [] studentScores = new int[no_of_students];
    
    for(i = 0; i < no_of_students; i++){
        System.out.println("Score " + (i+1));
        studentScores[i] = input.nextInt();
    }    
    } 
   }
