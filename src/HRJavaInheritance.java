import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class HRJavaInheritance{

    public static void main(String []argh){
        Adder X=new Adder();
        System.out.println("My superclass is: "+X.getClass().getSuperclass().getName());    
        System.out.print(X.add(10,32)+" "+X.add(10,3)+" "+X.add(10,10)+"\n");

    }
    
    
}
class Adder extends Arithmetic
{
  public int add(int a, int b)
  {
    return a+b;
  }
}

class Arithmetic
{
}
  