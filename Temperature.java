import java.util.Scanner;
public class Temperature {
	
	public static void main (String args[]) {
		System.out.println("Welcome to the temperature converter");
		System.out.println("Enter F for Celsius to Fahrenheit");
		System.out.println("Enter C for Fahrenheit to Celsius");
		Scanner scan = new Scanner(System.in);
		String type = scan.nextLine();
		
		if (type.equals("F")||(type.equals("f"))) {
			System.out.println("Please enter the temperature in Celsius");
			double c = scan.nextDouble();
			double f = c * (1.8) + 32;
			System.out.printf("\n%10.2f",f);
			System.out.println();
		}
		else if (type.equals("C")||(type.equals("c"))) {
			System.out.println("Please enter the temperature in Fahrenheit");
			double f = scan.nextDouble();
			double c = (f-32)/(1.8);
			System.out.printf("\n%10.2f",c);
			System.out.println();
		}
	}
}