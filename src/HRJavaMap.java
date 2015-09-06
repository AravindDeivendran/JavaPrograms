<<<<<<< HEAD
/**
 * Auto Generated Java Class.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class HRJavaMap {
  
  
  public static void main(String[] args) {
    
   try
    {
      System.setIn(new FileInputStream("C:/Aravind/Learning/Java/HR/Input.txt")) ;  
    }
    catch(java.io.FileNotFoundException e)
    {
      System.out.println("File not found");
    }
    //Scanner sc = new Scanner(System.in);
    try
    {
      BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
      
      int total = Integer.parseInt(sc.readLine());
      Map phonemap = new HashMap();
      
     
      
      for (int i = 0; i < total; i++)
      {
        String name = sc.readLine();
        int phno = Integer.parseInt(sc.readLine());
        phonemap.put(name,phno);
      }
      
      while(true)
      {
        String name = sc.readLine();
        if (name == null)
          break;
        if (!phonemap.containsKey(name))
          System.out.println("Not found"); 
        else
          System.out.println(name + "=" + phonemap.get(name));
      }
    }
    catch(IOException ioe)
    {
      
    }



  }  
  
   
  /* ADD YOUR CODE HERE */
  
}
=======
/**
 * Auto Generated Java Class.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class HRJavaMap {
  
  
  public static void main(String[] args) {
    
   try
    {
      System.setIn(new FileInputStream("C:/Aravind/Learning/Java/HR/Input.txt")) ;  
    }
    catch(java.io.FileNotFoundException e)
    {
      System.out.println("File not found");
    }
    //Scanner sc = new Scanner(System.in);
    try
    {
      BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
      
      int total = Integer.parseInt(sc.readLine());
      Map phonemap = new HashMap();
      
     
      
      for (int i = 0; i < total; i++)
      {
        String name = sc.readLine();
        int phno = Integer.parseInt(sc.readLine());
        phonemap.put(name,phno);
      }
      
      while(true)
      {
        String name = sc.readLine();
        if (name == null)
          break;
        if (!phonemap.containsKey(name))
          System.out.println("Not found"); 
        else
          System.out.println(name + "=" + phonemap.get(name));
      }
    }
    catch(IOException ioe)
    {
      
    }



  }  
  
   
  /* ADD YOUR CODE HERE */
  
}
>>>>>>> origin/master
