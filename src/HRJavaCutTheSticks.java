import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;

/**
 * Created by aravindd on 02/09/15.
 */
public class HRJavaCutTheSticks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        int count = Integer.parseInt(input);


        String tc = in.nextLine();

        int[] lst = Arrays.stream(tc.split(" ")).mapToInt(Integer::parseInt).toArray();

        while (lst.length > 0) {
            System.out.println(lst.length);
            int minSize = Arrays.stream(lst).min().getAsInt();
            lst = Arrays.stream(lst).map(no -> no - minSize).filter(no -> no > 0).toArray();
        }






    }
}
