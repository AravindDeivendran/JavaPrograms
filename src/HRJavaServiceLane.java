import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;

/**
 * Created by aravindd on 02/09/15.
 */
public class HRJavaServiceLane {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        int count = Integer.parseInt(input.split(" ")[1]);
        String width = in.nextLine();

        int[] widths = Arrays.stream(width.split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < count; i++) {

            String tc = in.nextLine();




            int start = Integer.parseInt(tc.split(" ")[0]);
            int end = Integer.parseInt(tc.split(" ")[1]);

            OptionalInt maxSize = Arrays.stream(Arrays.copyOfRange(widths,start,end+1)).min();


            System.out.println(maxSize.getAsInt());

        }
    }
}
