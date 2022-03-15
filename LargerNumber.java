
import java.util.*;

public class LargerNumber

{

   public static void main(String args[])

   {

      int num1,num2;

      Scanner sc= new Scanner(System.in);

      System.out.print("Enter first number: ");

      num1=sc.nextInt();

      System.out.print("Enter second number: ");

      num2=sc.nextInt();

      if(num1>num2)

      System.out.println(num1+" is larger");

      else if(num1<num2)

      System.out.println(num2+" is larger");

      else

      System.out.println("These numbers are equal");

   }

}
