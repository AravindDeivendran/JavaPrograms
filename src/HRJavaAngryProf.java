import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by aravindd on 01/09/15.
 */
public class HRJavaAngryProf {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = Integer.parseInt(in.nextLine());

        for (int i = 0; i < count; i++) {
            String input = in.nextLine();
            int total = Integer.parseInt(input.split(" ")[0]);
            int exp = Integer.parseInt(input.split(" ")[1]);

            long act = Arrays.stream(in.nextLine().split(" ")).mapToInt(Integer::parseInt).filter(no -> no <= 0).count();

            if (act >= exp)
                System.out.println("NO");
            else
                System.out.println("YES");


        }
    }
}
