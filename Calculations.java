


 import java.util.Scanner;

 public class Calculations
 {

 public static void main( String args[] )
 {
 Scanner input = new Scanner( System.in );

 int number1;
 int number2; 
 int number3; 
 int largest;
 int smallest;
 int sum; 
 int product; 
 int average; 

 System.out.print( "Enter first integer: " ); 
 number1 = input.nextInt(); 
 System.out.print( "Enter second integer: " ); 
 number2 = input.nextInt(); 
 System.out.print( "Enter third integer: " ); 
 number3 = input.nextInt(); 

 
 largest = number1; 

 if ( number2 > largest ) 
 largest = number2;

 if ( number3 > largest ) 
 largest = number3;

 smallest = number1; 

 if ( number2 < smallest ) 
 smallest = number2;

 if ( number3 < smallest ) 
 smallest = number3;

 sum = number1 + number2 + number3;
 product = number1 * number2 * number3;
 average = sum / 3;


 System.out.printf( "\nFor the numbers %d, %d and %d\n",
 number1, number2, number3 );
 System.out.printf( "Largest is %d\n", largest );
 System.out.printf( "Smallest is %d\n", smallest );
 System.out.printf( "Sum is %d\n", sum);
 System.out.printf( "Product is %d\n", product );
 System.out.printf( "Average is %d\n", average );
 }
 } 