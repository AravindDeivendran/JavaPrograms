/**
 * Auto Generated Java Class.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class HRJavaLoops {
  
  
  public static void main(String[] args) {
    

    Scanner sc = new Scanner(System.in);

    int total = Integer.parseInt(sc.nextLine());
    String printValue = "";

    for (int i = 0; i < total; i++)
    {
      String[] input = sc.nextLine().split(" ");
      printValue = printValue + Calculate(Integer.parseInt(input[0]),Integer.parseInt(input[1]),Integer.parseInt(input[2]));
    }

    System.out.println(printValue);
  }  
  private static String Calculate(int a, int b, int N)
  {
    int value = a;
    String retValue = "" ;
    for (int i = 0; i < N; i++)
    {
      value = value + ((int)Math.pow(2, i) * b);
      retValue = retValue + value + " ";
    }
    return retValue + "\n";
  }
  
   
  /* ADD YOUR CODE HERE */
  
}
