
public class JavaExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try
{
	int a=10;
	int b[]=new int[5];
	b[6]=15;
}
	catch(ArithmeticException a)
{
		System.out.println("An arithmetic error occur");
		System.out.println(a);
}
catch(ArrayIndexOutOfBoundsException e) //(Exception e)
{
	System.out.println(e);
}
	}

}
