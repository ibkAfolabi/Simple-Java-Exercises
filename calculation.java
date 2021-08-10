/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cufocsolutions;
import java.util.Scanner;//used to import  Scanner 
/**
 *
 * @author Ibukun
 */
public class calculation {
    public static void main(String [] args) {
    int sum,subtract,multiplication;
    float division;
   
    Scanner scanner = new Scanner (System.in); // create an object of scanner
    System.out.print("Enter first number: ");
    int a = scanner.nextInt(); // receive value into variable a from the keyboard
    System.out.print("Enter second number: ");
    int b = scanner.nextInt(); // receive value into variable b from the keyboard
    
       
    sum = a+b;
    subtract=a-b;
    division=a/b;
    multiplication=a*b;
    
    System.out.print("add=");
    System.out.println(sum);
    System.out.print("subtract=");
    System.out.println(subtract);
    System.out.print("division=");
    System.out.println(division);
    System.out.print("multiplication=");
    System.out.println(multiplication);
       }       
}
