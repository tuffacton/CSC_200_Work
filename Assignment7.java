/********************************************************************************
Develop and run a Java program to satisfy the following requirement:
A landscaping company sends employees to various sites (e.g. parks, school grounds, golf courses, etc). 
These sites will contain a variable number of land segments (plots) having one of 4 shapes:  
Square, rectangle, triangle, or circle. There may be more than one plot of the same shape, and the plots vary in size. 
Employees will need to run a program (the one you are writing) on a portable computer as they survey the site and perform 
determine the total area of all the plots at the site. The result will be used to determine the amount of soil, mulch, 
grass seed, and other landscaping materials that will be needed to maintain the site.  The program should adhere to the
following characteristics:
Use individual methods throughout to compute areas of the different shapes
The user should be presented with a menu of choices (including an exit)
The user should be prompted to input the necessary dimensions of the respective geometric shape in question.
Present the source code and evidence of output.
********************************************************************************/
import java.lang.Math.*;
import java.util.*;
public class Assignment7 
{
	
	public static void main (String args[]) 
   {
      double areas = 0;
      int answer = 0;
      boolean quit = false;
      Scanner scan = new Scanner(System.in);
      
      System.out.println("Welcome to the soil site planner.");
      while (quit == false) 
      {
         System.out.println("What type of area are you adding?\n1. Square\n2. Circle\n3.Triangle\n4.Rectangle");
         answer = Integer.parseInt(scan.nextLine());
         
         if (answer == 1) 
         {
            double a1 = square();
            System.out.println("Square area = " + a1);
            areas += a1;
            quit = again();
         }
         else if (answer == 2) 
         {
            double a2 = circle();
            System.out.println("Circle area = " + a2);
            areas += a2;
            quit = again();
         }
         else if (answer == 3) 
         {
            double a3 = triangle();
            System.out.println("Triangle area = " + a3);
            areas += a3;
            quit = again();
         }
         else if (answer == 4) 
         {
            double a4 = rectangle();
            System.out.println("Rectangle area = " + a4);
            areas += a4;
            quit = again();
         }
         else {
            System.out.print("Not a response");
            quit = again();
         }
      }
      System.out.println("Total area= " + areas);
   }
      
   
   public static double square() 
   {
      Scanner scan = new Scanner(System.in);
      System.out.println("Please enter side length");
      double x = Double.parseDouble(scan.nextLine());
      double area = Math.pow(x, 2);
      return area;
   } 
   
   public static double circle() 
   {
      Scanner scan = new Scanner(System.in);
      System.out.println("Please enter radius length");
      double rad = Double.parseDouble(scan.nextLine());
      double area = Math.pow(rad, 2) * Math.PI;
      return area;
   } 
   
   public static double triangle() 
   {
      Scanner scan = new Scanner(System.in);
      System.out.println("Please enter base length");
      double base = Double.parseDouble(scan.nextLine());
      System.out.println("Please enter height length");
      double height = Double.parseDouble(scan.nextLine());
      double area = base * height / 2.0;
      return area;
   }
    
   public static double rectangle() 
   {
      Scanner scan = new Scanner(System.in);
      System.out.println("Please enter x axis length");
      double x = Double.parseDouble(scan.nextLine());
      System.out.println("Please enter y axis length");
      double y = Double.parseDouble(scan.nextLine());
      double area = x * y;
      return area;
   } 
   
   public static boolean again() 
   {
      Scanner scan = new Scanner(System.in);
      System.out.println("Would you like to go again?\n 'n' key for no");
      String ans = scan.nextLine();
      if (ans.equals("n")) 
      {
         return true;
      } 
      else
      {
         return false;
      } 
   }
}