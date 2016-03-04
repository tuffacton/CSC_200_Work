import java.util.Scanner;
public class Assignment5 {
	
	public static void main (String args[]) {
		Scanner scan = new Scanner(System.in);
      System.out.println("Indicate first number (integer):");
      int FIRST = Integer.parseInt(scan.nextLine());
      System.out.println("Indicate last number (integer):");
      int LAST = Integer.parseInt(scan.nextLine());
      System.out.println("Indicate the interval (integer):");
      int DELTA = Integer.parseInt(scan.nextLine());
      
      int n = FIRST;
      int SUM = 0;
      while(n <= LAST){
         SUM += n;
         n += DELTA;
         System.out.println(SUM);
      }
    }
}