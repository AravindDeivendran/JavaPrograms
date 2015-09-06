<<<<<<< HEAD
/**
 * Auto Generated Java Class.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class HRJavaStack {
  
  
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
      
      
      
      while(true)
      {
        String s = sc.readLine();
        if (s == null)
          break;
        System.out.println(validateItem(s));
      }
    }
    catch(IOException ioe)
    {
      
    }
  }
   private static boolean validateItem(String s)
   {
     Stack st = new Stack();
     for (int i =0; i < s.length(); i++)
     {
       String c = "" + s.charAt(i);
       if (isOpener(c))
       {
         st.push(c);
       }
       else
       {
         if(st.empty())
           return false;
         else
         {
           String p = getPair(c);
           if (((String) st.peek()).equals(p))
           {
             String remove = (String) st.pop();
             
           }
           else
             return false;
         }
       }
     }
     if (st.empty())
       return true;
     else
       return false;
   }
   
   private static String getPair(String s)
   {
     switch(s)
     {
       case "{": return "}";
       case "}": return "{";
       case "[": return "]";
       case "]": return "[";
       case "(": return ")";
       case ")": return "(";
   }
     return "";
   } 
   
   private static boolean isOpener(String s)
   {
     if(s.equals("{") || s.equals("[") || s.equals("("))
       return true;
     else
       return false;
     
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
public class HRJavaStack {
  
  
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
      
      
      
      while(true)
      {
        String s = sc.readLine();
        if (s == null)
          break;
        System.out.println(validateItem(s));
      }
    }
    catch(IOException ioe)
    {
      
    }
  }
   private static boolean validateItem(String s)
   {
     Stack st = new Stack();
     for (int i =0; i < s.length(); i++)
     {
       String c = "" + s.charAt(i);
       if (isOpener(c))
       {
         st.push(c);
       }
       else
       {
         if(st.empty())
           return false;
         else
         {
           String p = getPair(c);
           if (((String) st.peek()).equals(p))
           {
             String remove = (String) st.pop();
             
           }
           else
             return false;
         }
       }
     }
     if (st.empty())
       return true;
     else
       return false;
   }
   
   private static String getPair(String s)
   {
     switch(s)
     {
       case "{": return "}";
       case "}": return "{";
       case "[": return "]";
       case "]": return "[";
       case "(": return ")";
       case ")": return "(";
   }
     return "";
   } 
   
   private static boolean isOpener(String s)
   {
     if(s.equals("{") || s.equals("[") || s.equals("("))
       return true;
     else
       return false;
     
   }

  
   
  /* ADD YOUR CODE HERE */
  
}
>>>>>>> origin/master
