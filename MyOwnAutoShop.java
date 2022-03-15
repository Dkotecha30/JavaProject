public class MyOwnAutoShop
{
	int speed;
	double regularPrice;
	String color;
	int year;
	int manufacturerDiscount;
	public static void main(String args[])
	{
		Sedan mySedan = new Sedan(160,2000,"Red",10);
		Ford myFord1 = new Ford(156,4452.0,"Black",2005,10);
		Ford myFord2 = new Ford(155,5000.0,"Pink",1998,5);
		Car myCar = new Car(555,56856.0,"Red");
		System.out.println("My Sedan price is "+myFord1.getSalePrice());
		System.out.println("My Ford 1 price is "+myFord2.getSalePrice());
		System.out.println("My Car price is "+myCar.getSalePrice());
	}
}

