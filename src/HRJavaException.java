<<<<<<< HEAD
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HRJavaException{

public static void main(String []argh)
    {
       Scanner in = new Scanner(System.in);

        while(in.hasNextInt())
        {
            int n = in.nextInt();
            int p = in.nextInt();
            myCalculator M = new myCalculator();
            try
            {
                System.out.println(M.power(n,p));
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }
    /*
     *  ImplementedInterfaceNames method takes an object and prints the name of the interfaces it implemented
     */

   
    
}


class myCalculator 
{
  public int power(int n, int p) throws Exception
  {
    if (n < 0 || p < 0)
    throw new Exception("n and p should be non-negative");
   
    return (int)Math.pow(n,p);
  
  }
}






=======
import java.util.Scanner;

public class HRJavaException{

public static void main(String []argh)
    {
       Scanner in = new Scanner(System.in);

        while(in.hasNextInt())
        {
            int n = in.nextInt();
            int p = in.nextInt();
            myCalculator M = new myCalculator();
            try
            {
                System.out.println(M.power(n,p));
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }
    /*
     *  ImplementedInterfaceNames method takes an object and prints the name of the interfaces it implemented
     */

   
    
}


class myCalculator 
{
  public int power(int n, int p) throws Exception
  {
    if (n < 0 || p < 0)
    throw new Exception("n and p should be non-negative");
   
    return (int)Math.pow(n,p);
  
  }
}






>>>>>>> origin/master
  