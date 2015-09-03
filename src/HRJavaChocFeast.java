import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by aravindd on 02/09/15.
 */
public class HRJavaChocFeast {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        int count = Integer.parseInt(input);

        for (int i = 0; i < count; i++) {
            String tc = in.nextLine();
            int[] inputs = Arrays.stream(tc.split(" ")).mapToInt(Integer::parseInt).toArray();

            int noOfChoc = inputs[0]/inputs[1];
            int total = noOfChoc;
            int noOfWrappers = noOfChoc;

            while (noOfWrappers >= inputs[2])
            {
                int balance = noOfWrappers % inputs[2];
                noOfChoc = noOfWrappers / inputs[2];
                noOfWrappers = noOfChoc + balance;
                total = total + noOfChoc;
            }

            System.out.println(total);
        }




    }
}
