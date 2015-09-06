import java.util.Scanner;

/**
 * Created by aravindd on 05/09/15.
 */
public class HRJavaKaprekar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int from = in.nextInt();
        int to = in.nextInt();
        int count = 0;
        for (int i = from; i <= to; i++) {
            if (isKaprekar(i)) {
                System.out.print(i + " ");
                count = count + 1;
            }
        }
        if (count == 0)
            System.out.println("INVALID RANGE");
    }
    private static boolean isKaprekar(int no)
    {
        long sq = (long) Math.pow(no,2);
        long mid = 0;
        int noOfDigits = String.valueOf(sq).length();

        if (noOfDigits == 1)
            mid = 1;

        else if (noOfDigits % 2 == 0)
             mid = (long) Math.pow(10, noOfDigits / 2);
        else {

            mid = ((long) Math.pow(10, noOfDigits / 2 + 1));
        }
        long sq1 = sq / (mid);
        long sq2 = sq % (mid);
        if (no == (sq1 + sq2))
            return true;
        else
            return false;
    }
}
