<<<<<<< HEAD
/**
 * Auto Generated Java Class.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
  public class HRJavaArray1DHard {
  
  
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
      BufferedReader res = new BufferedReader(new InputStreamReader(new FileInputStream("C:/Aravind/Learning/Java/HR/Result.txt")));
      
      int total = Integer.parseInt(sc.readLine());
      
      for (int i = 0; i < total; i++)
      {
        String str = sc.readLine();
        int n = Integer.parseInt(str.split(" ")[0]);
        int m = Integer.parseInt(str.split(" ")[1]);
        str = sc.readLine();
        String result = validate(str, n, m);
        //if (!result.equals(res.readLine()))
        //  System.out.println("Failed " + n + " " + m);
        System.out.println(result);
        }
    }
    catch(IOException ioe)
    {
      
    }  
    }
    private static String validate(String str, int n, int m)
    {
              int[] seq = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();
        
        int index = 0;
        boolean bIndexNotSet = false;
        boolean[] cellsvisited = new boolean[seq.length];
        cellsvisited[0] = true;
        while(true)
        {
          
          
          if(bIndexNotSet) 
          {
            return "NO";
          }
          
          if (m > n)
          {  
            return "YES";
          }            
          
          if (seq[index] == 1 )
          {  
            return "NO";
          }
          
          if (index+ 1 >= n || index + m >= n)
          {  
            return "YES";
          }


          if (index+m < n && seq[index+m] == 0 && !cellsvisited[index+m] )
          {  
            bIndexNotSet = false;
            index = index+m;
            cellsvisited[index] = true;
            continue;
          }

          if (index-1 >= 0 && seq[index-1] == 0 && !cellsvisited[index-1])
          {
            bIndexNotSet = false;
            index = index-1;
            cellsvisited[index] = true;
            continue;
          }
          
          if (index+1 < n && seq[index+1] == 0 && !cellsvisited[index+1])
          {
            bIndexNotSet = false;
            index = index+1;
            cellsvisited[index] = true;
            continue;
          }
          
         
          if (seq[index+1] == 1 && seq[index+m] == 1)
          {  
            return "NO";
          }          
 
          bIndexNotSet = true;
                     
            
        }
        
      }
      


      
    
    

  }  
  
   
  /* ADD YOUR CODE HERE */
  

=======
/**
 * Auto Generated Java Class.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
  public class HRJavaArray1DHard {
  
  
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
      BufferedReader res = new BufferedReader(new InputStreamReader(new FileInputStream("C:/Aravind/Learning/Java/HR/Result.txt")));
      
      int total = Integer.parseInt(sc.readLine());
      
      for (int i = 0; i < total; i++)
      {
        String str = sc.readLine();
        int n = Integer.parseInt(str.split(" ")[0]);
        int m = Integer.parseInt(str.split(" ")[1]);
        str = sc.readLine();
        String result = validate(str, n, m);
        //if (!result.equals(res.readLine()))
        //  System.out.println("Failed " + n + " " + m);
        System.out.println(result);
        }
    }
    catch(IOException ioe)
    {
      
    }  
    }
    private static String validate(String str, int n, int m)
    {
              int[] seq = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();
        
        int index = 0;
        boolean bIndexNotSet = false;
        boolean[] cellsvisited = new boolean[seq.length];
        cellsvisited[0] = true;
        while(true)
        {
          
          
          if(bIndexNotSet) 
          {
            return "NO";
          }
          
          if (m > n)
          {  
            return "YES";
          }            
          
          if (seq[index] == 1 )
          {  
            return "NO";
          }
          
          if (index+ 1 >= n || index + m >= n)
          {  
            return "YES";
          }


          if (index+m < n && seq[index+m] == 0 && !cellsvisited[index+m] )
          {  
            bIndexNotSet = false;
            index = index+m;
            cellsvisited[index] = true;
            continue;
          }

          if (index-1 >= 0 && seq[index-1] == 0 && !cellsvisited[index-1])
          {
            bIndexNotSet = false;
            index = index-1;
            cellsvisited[index] = true;
            continue;
          }
          
          if (index+1 < n && seq[index+1] == 0 && !cellsvisited[index+1])
          {
            bIndexNotSet = false;
            index = index+1;
            cellsvisited[index] = true;
            continue;
          }
          
         
          if (seq[index+1] == 1 && seq[index+m] == 1)
          {  
            return "NO";
          }          
 
          bIndexNotSet = true;
                     
            
        }
        
      }
      


      
    
    

  }  
  
   
  /* ADD YOUR CODE HERE */
  

>>>>>>> origin/master
