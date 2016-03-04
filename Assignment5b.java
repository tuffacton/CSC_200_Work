import java.util.Scanner;
public class Assignment5b {
	
	public static void main (String args[]) {
		Scanner scan = new Scanner(System.in);
      System.out.println("Indicate first number (integer):");
      int FIRST = Integer.parseInt(scan.nextLine());
      System.out.println("Indicate last number (integer):");
      int LAST = Integer.parseInt(scan.nextLine());
      System.out.println("Indicate the interval (integer):");
      int DELTA = Integer.parseInt(scan.nextLine());
      

      int SUM = 0;
      for(int i = FIRST; i <= LAST; i += DELTA){
         SUM += i;
         System.out.println(SUM);
      }
   }
}