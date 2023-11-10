import java.util.Scanner;
class convert
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Temperature in Fahrenheit : ");
		double f1 = sc.nextDouble();
		double c1 = 5.0/9*(f1-32);
		System.out.println("Temperature in degrees Celsius : "+c1);

		System.out.println("Enter Temperature in degrees Celsius : ");
		double c2 = sc.nextDouble();
		double f2 = (c2 *9.0/5)+32;
		System.out.println("Temperature in Fahrenheit : "+f2);

 	}
	
}
