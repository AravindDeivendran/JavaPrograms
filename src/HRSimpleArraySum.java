import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by aravindd on 27/08/15.
 */
public class HRSimpleArraySum {
    public static void main(String []args)
    {
        Scanner in = new Scanner(System.in);
        int ctr = Integer.parseInt(in.nextLine());
        long total = 0;
            String line = in.nextLine();
            int[] nos = Arrays.stream(line.split(" ")).mapToInt(Integer::parseInt).toArray();
            total = Arrays.stream(nos).sum();

        System.out.println(total);

    }
}
