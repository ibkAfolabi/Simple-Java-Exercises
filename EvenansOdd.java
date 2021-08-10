/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cufocsolutions;

/**
 *
 * @author Ibukun
 */
public class EvenansOdd {
    int even(int x){
int k;
System.out.println("This method prints the sum of even numbers between 1 and 100 is:");
System.out.println("The even numbers are:");
for(k=0;k<=100;k=k+2)
{
 	System.out.print( k);
        System.out.print("\t");
        x+=k;
}
System.out.println("The sum of even numbers is:");
System.out.println(x);
return x;
}
int odd(int y)
{int p;
System.out.println("This method prints the sum of odd numbers between 1 and 100 is:");
System.out.println("The odd numbers are:");
for(p=1;p<=100;p=p+2)
{ 
    System.out.print( p);
    System.out.print("\t");
    y+=p;
}
System.out.println("The sum of odd  numbers are:");
System.out.println(y);
return y;
}
}
