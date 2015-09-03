/**
 * Auto Generated Java Class.
 */
import java.io.*;
import java.util.*;
import java.util.stream.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class HRJava1DArray {
  
  
  public static void main(String[] args) {
    
    int ctr = 0;
    Scanner sc = new Scanner(System.in);

    int total = Integer.parseInt(sc.nextLine());
    int[] a = new int[total];
    String str = sc.nextLine();
    
    a = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();

    
    for (int i = 0; i < total; i++)
    {
      for (int j = 0; j < total-i+1; j++)
      {
        int[] newArray = Arrays.copyOfRange(a, i, i+j);
        for(int k=0; k < newArray.length; k++)
        {
          System.out.println(newArray[k]);
        }
        System.out.println("");
        if (IntStream.of(newArray).sum() < 0)
          ctr++;
      }
    }

    System.out.println(ctr);
    
  }  
  
   
  /* ADD YOUR CODE HERE */
  
}
