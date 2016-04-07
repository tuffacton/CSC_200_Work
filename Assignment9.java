/*Develop a program to perform a binary search on 
a one-dimensional integer array LIST of dimension N. 
You should develop an independent search method (call 
it BinSearch), and write your program so that the
BinSearch method is invoked from your main program 
or another method. The BinSearch method should 
accept a search key parameter and return a Boolean 
value (Success). Maintain a count of the number of 
comparisons attempted during the execution of the
method. Assume the array is already sorted in
ascending order, and that there are no duplicate
entries. Use a while loop for the binary search. 
Repeat the above assignment using a recursive method 
for the binary search instead of the while loop. 
Repeat the above to perform a sequential search 
on the same array. In each of the above cases, 
maintain a count of the number of iterations needed 
to perform the different search functions on the same
array. I all cases, remember to include the condition 
when a search key is NOT found in the array.
*/
import java.lang.Math.*;
import java.util.*;
public class Assignment9 
{
	
	public static void main (String args[]) 
   {
      Scanner scan = new Scanner(System.in);
      
      System.out.println("Specify how long the list is, N");
      int N = Integer.parseInt(scan.nextLine());
      
      
      System.out.println("What integer would you like to search for?");
      int search = Integer.parseInt(scan.nextLine());
      
      System.out.println(BinSearch(N, search));
   }
   
   public static int BinSearch(int N, int x)
   {
      ArrayList<Integer> list = new ArrayList<Integer>();
      
      for(int i=0; i<N; i++)
      {
          list.add(i+1);
      }
      
      int min = 0, max = N-1;
      int guess  = (min + max / 2);
      int count = 0;
      boolean check = true;
      
      while (check == true)
      {
      if (list.get(guess) == x)
         {
         check = false;
         count ++;
         System.out.println("Count =" + count);
         }
      else if (list.get(guess) < x)
         {
         min = guess + 1;
         count ++;
         check = true;
         System.out.println("Count =" + count);
         }
      else if (list.get(guess) > x)
         {
         max = guess -1;
         count ++;
         check = true;
         System.out.println("Count =" + count);
         }
         
      }return guess;
   }
}
