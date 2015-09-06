<<<<<<< HEAD
/**
 * Auto Generated Java Class.
 */
import java.io.*;
import java.util.*;
import java.util.stream.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class HRJava2DArray {
  
  
  public static void main(String[] args) {
    
    
    Scanner sc = new Scanner(System.in);

    int rowsize = 6;
    int colsize = 6;
    int sum =0;
    int largesum = -999999;
    
    int[][] a = new int[rowsize][colsize];
    
    for(int i = 0; i < rowsize; i++)
    {
      String str = sc.nextLine();
      a[i] = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();
    }
    
   
    for (int i = 0; i < rowsize; i++)
    {
      for (int j = 0; j < colsize; j++)
      {
        System.out.println(i + " " + j);
        if (i + 1 > rowsize - 1 || i + 2 > rowsize - 1 || j + 1 > colsize - 1 || j+2 > colsize - 1)
          continue;
        sum = a[i][j] + a[i][j+1] + a[i][j+2] + a[i+1][j+1] + a[i+2][j] + a[i+2][j+1] + a[i+2][j+2];
        System.out.println(sum);
        if (sum > largesum)
          largesum = sum;
      }
    }

    System.out.println(largesum);
    
  }  
  
   
  /* ADD YOUR CODE HERE */
  
}
=======
/**
 * Auto Generated Java Class.
 */
import java.io.*;
import java.util.*;
import java.util.stream.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class HRJava2DArray {
  
  
  public static void main(String[] args) {
    
    
    Scanner sc = new Scanner(System.in);

    int rowsize = 6;
    int colsize = 6;
    int sum =0;
    int largesum = -999999;
    
    int[][] a = new int[rowsize][colsize];
    
    for(int i = 0; i < rowsize; i++)
    {
      String str = sc.nextLine();
      a[i] = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();
    }
    
   
    for (int i = 0; i < rowsize; i++)
    {
      for (int j = 0; j < colsize; j++)
      {
        System.out.println(i + " " + j);
        if (i + 1 > rowsize - 1 || i + 2 > rowsize - 1 || j + 1 > colsize - 1 || j+2 > colsize - 1)
          continue;
        sum = a[i][j] + a[i][j+1] + a[i][j+2] + a[i+1][j+1] + a[i+2][j] + a[i+2][j+1] + a[i+2][j+2];
        System.out.println(sum);
        if (sum > largesum)
          largesum = sum;
      }
    }

    System.out.println(largesum);
    
  }  
  
   
  /* ADD YOUR CODE HERE */
  
}
>>>>>>> origin/master
