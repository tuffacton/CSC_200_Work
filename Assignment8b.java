/* Develop a Java program that will add the corresponding elements of
 two 1-dimensional arrays X and Y to produce the 1-dimensional array Z.  
 Arrays X, Y, Z have the same dimension [M].*/
 
import java.lang.Math.*;
import java.util.*;
public class Assignment8b 
{
	
	public static void main (String args[]) 
   {
      Scanner scan = new Scanner(System.in);
      
      System.out.println("Specify how many values are in your random lists:");
      int n = Integer.parseInt(scan.nextLine());
      ArrayList<Integer> list = new ArrayList<Integer>();
      ArrayList<Integer> list2 = new ArrayList<Integer>();
      
      populate(list,n);
      System.out.println("Your first list is: " + list);
      populate(list2,n);
      System.out.println("Your second list is: " + list2);
      
      System.out.println("The array sum of the two lists is: ");
      ArrayList<Integer> list3 = sum(list, list2);
      System.out.println(list3);
            
   }
   
   public static void populate(ArrayList<Integer> Plist,int n)
   {
      Random random = new Random();
      for(int i=0; i < n; i++)
      {
         Plist.add(random.nextInt(100)+1);
      }
   }
   
   public static ArrayList<Integer> sum(ArrayList<Integer> Slist1, ArrayList<Integer> Slist2)
   {
      ArrayList<Integer> sumlist = new ArrayList<Integer>();
      for (int i=0; i < Slist1.size(); i++)
      {
         sumlist.add(Slist1.get(i) + Slist2.get(i));
      }
      return sumlist;
   }

}