import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by aravindd on 01/09/15.
 */
public class HRJavaFindDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = Integer.parseInt(in.nextLine());

        for (int i = 0; i < count; i++) {

            String input = in.nextLine();
            int number = Integer.parseInt(input);
            long ctr = Arrays.stream(input.split("")).mapToInt(Integer::parseInt).filter(no -> no != 0 && (number % no) == 0).count();

            System.out.println(ctr);

        }
    }
}
