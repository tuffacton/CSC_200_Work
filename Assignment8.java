/*Determine (i.e. “return”) the highest value in LIST.
Determine (i.e. “return”) the lowest value in LIST.
Determine (i.e. “return”) the sum of all the items in LIST.
Determine (i.e. “return”) the average of the values in LIST after eliminating the lowest and
the highest values. This method should invoke some or all of the other 3 methods.
*/
import java.lang.Math.*;
import java.util.*;
public class Assignment8 
{
	
	public static void main (String args[]) 
   {
      Random random = new Random();
      Scanner scan = new Scanner(System.in);
      
      System.out.println("Specify how many values are in your random list:");
      int n = Integer.parseInt(scan.nextLine());
      System.out.println("Your list is: ");
      ArrayList<Integer> list = new ArrayList<Integer>();
      
      for(int i=0; i<n; i++)
      {
         list.add(random.nextInt(100)+1);
      }
      
      System.out.println(list);
      System.out.println("Highest integer in the list is " + highest(list));
      System.out.println("Lowest integer in the list is " + lowest(list));
      System.out.println("Sum of the integers in the list is " + sum(list));
      System.out.println("Average of the integers in the list is " +  average(list));
      
   }
   
   public static int highest(ArrayList<Integer> Hlist)
   {
      int h = 0;
      for (int i: Hlist)
      {
         if (i > h) 
         {
            h = i;
         }
      }
      return h;
   }
   
   public static int lowest(ArrayList<Integer> Llist)
   {
      int l = 100;
      for (int i: Llist)
      {
         if (i < l) 
         {
            l = i;
         }
      }
      return l;
   
   }
   
   public static int sum(ArrayList<Integer> Slist)
   {
      int sum = 0;
      for (int i: Slist)
      {
         sum += i;
      }
      return sum;
   
   }
   
   public static double average(ArrayList<Integer> Alist)
   {
      return ((double)sum(Alist)/Alist.size());
   }
}