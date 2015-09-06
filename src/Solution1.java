/**
 * Auto Generated Java Class.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution1 {
  
  
  public static void main(String[] args) {
    

    Scanner sc = new Scanner(System.in);

    int total = Integer.parseInt(sc.nextLine());
    String printValue = "";
    for (int i = 0; i < total; i++)
    {
      printValue = printValue + findTypes(sc.nextLine());
    }
    
    System.out.println(printValue);
  }  
    private static String findTypes(String s)
    {
      String retString = s + " can be fitted in:\n";
      try
      {
        int i = Integer.parseInt(s);
        if (i >= -128 && i <= 127 )
          retString = retString + "* byte\n";
        if (i >= -32768 && i <= 32767)
          retString = retString + "* short\n";
        if (i >= -2147483648 && i <= 2147483647)
          retString = retString + "* int\n";
        
        retString = retString + "* long\n";
      }
      catch(NumberFormatException ne)
      {
        try
        {
          long l = Long.parseLong(s);
          retString = retString + "* long\n";
        }
        catch(NumberFormatException ne1)
        {
          retString = s + " can't be fitted anywhere.\n";
        }
      }
      
      return retString;
    }
  
  
   
  /* ADD YOUR CODE HERE */
  
}
