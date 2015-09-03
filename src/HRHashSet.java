/**
 * Auto Generated Java Class.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class HRHashSet {
  
  
  public static void main(String[] args) {
    
    try
    {
      System.setIn(new FileInputStream("C:/Aravind/Learning/Java/HR/Input.txt")) ;  
    }
    catch(java.io.FileNotFoundException e)
    {
      System.out.println("File not found");
    }

    
    try
    {
      BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
      
      int total = Integer.parseInt(sc.readLine());
      Set set = new HashSet();
      
      for (int i = 0; i < total; i++)
      {
        set.add(sc.readLine());
        System.out.println(set.size());
      }
    }
    catch(IOException ioe)
    {
      
    }
    



  }  
  
   
  /* ADD YOUR CODE HERE */
  
}
