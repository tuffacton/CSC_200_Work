import java.util.Scanner;
public class movie {
	
	public static void main (String args[]) {
		System.out.println("Welcome to Acton Theaters!");
		System.out.println("Please enter your age:");
		Scanner scan = new Scanner(System.in);
		int age = Integer.parseInt(scan.nextLine());
		System.out.println("Please enter the movie time (just the hour):");
		int time = Integer.parseInt(scan.nextLine());
		System.out.println("Your movie is part of the film festival (true/false):");
		String ans = scan.nextLine();
		Boolean festival = Boolean.valueOf(ans);
		
		if (festival == true) {
			System.out.println("Charge = $15.00");
			
		} else if (festival == false) {
		 if (time < 5) {
			System.out.println("Charge = $10.00");

		} else if (age <= 12) {
			System.out.println("Charge = $10.00");
			
		} else if (age > 12 && age < 65) {
			System.out.println("Charge = $25.00");
			
		} else if (age >= 65) {
			System.out.println("Charge = $18.75");
		}
	}
}
}
