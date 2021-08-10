/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cufocsolutions;

import java.util.Scanner;
public class greater {
    public static void main(String[] args) {
        int [] numbers = new int[7];
        Scanner input = new Scanner(System.in);
        int i;
        // Enter and store the numbers
        for(i = 0; i < 6; i++)
        {
            System.out.println("Enter number[" + i + "]: ");
            numbers[i] = input.nextInt();}
                // Determine the largest
        int largest = numbers[0];
        for(i = 1; i < 6; i++)
        {if(numbers[i] > largest)
            {
                largest = numbers[i];
            }}
        // Determine the smallest
        int smallest = numbers[0];
        for(i = 1; i < 6; i++)
        {
            if(numbers[i] < smallest)
            {
                smallest = numbers[i];
            }}
        // Print largest and smallest
        System.out.println("Largest number = " + largest);
        System.out.println("Smallest number = " + smallest);
    } }
