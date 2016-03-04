/*********************************************************************************************

*********************************************************************************************/

import java.util.Scanner;
public class Assigment6 {
	
	public static void main (String args[]) {
		//provide options to user
		
      Scanner scan = new Scanner(System.in);

      //Initialize Variables
      int type = 0;
      double conv = 0;
		String unit = "";
            
      do {
      System.out.println("Welcome to the Acton Converter!");
		System.out.println("Select from the following items:");
		System.out.println("1. Ounces to grams");
		System.out.println("2. Grams to ounces");
		System.out.println("3. Pounds to kilograms");
		System.out.println("4. Kilograms to pounds");
		System.out.println("5. Feet to meters");
		System.out.println("6. Meters to feet");
		System.out.println("7. Miles to kilometers");
		System.out.println("8. Kilometers to miles");
      System.out.println("9. Quit");
      System.out.println("Enter. Go again");
		
		
      //set a scanner to ask user 
		
      type = Integer.parseInt(scan.nextLine());
		
      //switch between conversion types
      
      switch (type) {
			//set conversion rate and unit for each case
			case 1:
				conv = 28.375 ;
				unit = "grams";
				break;
			case 2:
				conv = 0.035;
				unit = "ounces";
				break;
			case 3:
				conv = 0.454 ;
				unit = "kilograms";
				break;				
			case 4:
				conv = 2.204 ;
				unit = "pounds";
				break;
			case 5:
				conv = 0.3 ;
				unit = "meters";
				break;
			case 6:
				conv = 3.3 ;
				unit = "feet";
				break;
			case 7:
				conv = 1.6 ;
				unit = "kilometers";
				break;				
			case 8:
				conv = 0.6 ;
				unit = "miles";
				break;
         case 9:
            System.out.println("Goodbye!");
            break;
            
		}
		if (type != 9){
         //obtain users initial query as a double
   		System.out.println("Type initial measurement:");
   		double meas = Double.parseDouble(scan.nextLine());
   		
         //perform conversion and print answer
   		double ans = meas * conv;
   		System.out.println("Your answer is "	+ ans + " " + unit);
         scan.nextLine();
      }
      }while (type != 9);
   }
}
