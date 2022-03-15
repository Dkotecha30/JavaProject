import java.util.*;
public class Arithmetic 
{
	
	public static void main(String[] args) 
	{
		
		Scanner input=new Scanner(System.in);
		
		
		int num1;	// first integer for user input
		int num2;	// second integer for user input
		int sum;	// sum of num1 and num2
		int product;	// product of num1 and num2
		int difference;	// difference of num1 and num2
		int quotient;	// quotient of num1 and num2
		
		System.out.print("Enter first integer: ");	
		num1 = input.nextInt();	
		
		System.out.print("Enter second integer: ");	
		num2 = input.nextInt();	
		
		sum	= num1 + num2;	
		product	= num1 * num2;	
		difference = num1 - num2;
		quotient = num1 / num2;	
		
		System.out.printf("Sum is %d\n", +sum);	
		System.out.printf("Product is %d\n", +product);	
		System.out.printf("Difference is %d\n", +difference);	
		System.out.printf("Quotient is %d\n", +quotient);	
		
	}	

}	