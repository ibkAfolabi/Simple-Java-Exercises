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
public class timesTable {
   public static void main(String[] args) {
        int number, i;    
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number: ");
        number = input.nextInt();
        for(i = 1; i <= 10; i++)
        {
            System.out.println(number + "*" + i + "=" + (number * i));
        }
    } 
}

 

