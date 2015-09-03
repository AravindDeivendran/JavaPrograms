/**
 * Auto Generated Java Class.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class HRJavaStrings {
  
  
  public static void main(String[] args) {
    

    Scanner sc = new Scanner(System.in);

    String str = sc.nextLine();
    int len = Integer.parseInt(sc.nextLine());
    String small = "";
    String large = "";
    String substr = "";

    for (int i = 0; i < str.length(); i++)
    {
      if (i + len <= str.length())
        substr = str.substring(i, i+len);
      else
        break;
      
      if (small == "" || substr.compareTo(small) < 0 )
        small = substr;
      
      if (large == "" || substr.compareTo(large) > 0)
        large = substr;
      

    }

    System.out.println(small);
    System.out.println(large);
  }  
  
}