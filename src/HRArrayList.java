/**
 * Auto Generated Java Class.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
  public class HRArrayList {
  
  
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
      List<List<String>> al = new ArrayList<List<String>>();
      
      for (int i = 0; i < total; i++)
      {
        List<String> s = new ArrayList<String>();
        String str = sc.readLine();
        s = Arrays.asList(str.split(" "));
        s = s.subList(1,s.size());
        al.add(s);
         System.out.println(al);
      }
      
      int totalp = Integer.parseInt(sc.readLine());

      for (int i = 0; i < totalp; i++)
      {
        try
        {
          String[] res = sc.readLine().split(" ");
          System.out.println((al.get(Integer.parseInt(res[0])-1)).get(Integer.parseInt(res[1])-1));
        }
        catch(IndexOutOfBoundsException ie)
        {
           System.out.println("ERROR!"); 
        }
      }

    
        }
    catch(IOException ioe)
    {
      
    }  


  }  
  
   
  /* ADD YOUR CODE HERE */
  
}
