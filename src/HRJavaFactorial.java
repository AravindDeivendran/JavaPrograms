import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by aravindd on 01/09/15.
 */
public class HRJavaFactorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger no = new BigInteger(in.nextLine());
        System.out.println(Fact(no));
    }
    private static BigInteger Fact(BigInteger i)
    {
        if(i.equals(BigInteger.ONE))
            return BigInteger.ONE;
        else
            return i.multiply(Fact(i.subtract(BigInteger.ONE)));
    }
}
