/**
 * Auto Generated Java Class.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class HRJavaBigDSort {
  
  
  public static void main(String[] args) {
    

    Scanner sc = new Scanner(System.in);

    int total = Integer.parseInt(sc.nextLine());
    BigDecimal[] bd = new BigDecimal[total];

    for (int i = 0; i < total; i++)
    {
      bd[i] = new BigDecimal(sc.nextLine());
    }
    
    Arrays.sort(bd);
    
    for (int i = total - 1; i >= 0; i--)
    {
      System.out.println(bd[i].toPlainString().replaceAll("^0.","."));
    }

  }  
  
   
  /* ADD YOUR CODE HERE */
  
}
