import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by aravindd on 28/08/15.
 */
public class HRJavaPlusMinus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ctr = Integer.parseInt(in.nextLine());
        String line = in.nextLine();
        int[] nos = Arrays.stream(line.split(" ")).mapToInt(Integer::parseInt).toArray();
        long total = Arrays.stream(nos).count();
        long totGreater = Arrays.stream(nos).filter(no -> no > 0).count();
        long totSmaller = Arrays.stream(nos).filter(no -> no < 0).count();
        long totZero = Arrays.stream(nos).filter(no -> no == 0).count();

        System.out.println((double) totGreater/total );
        System.out.println((double) totSmaller/total );
        System.out.println((double) totZero/total );

    }


}
