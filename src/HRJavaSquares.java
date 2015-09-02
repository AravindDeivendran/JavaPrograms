import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by aravindd on 02/09/15.
 */
public class HRJavaSquares {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = Integer.parseInt(in.nextLine());

        for (int i = 0; i < count; i++) {

            String input = in.nextLine();

            int start = (int) Math.ceil(Math.sqrt(Integer.parseInt(input.split(" ")[0])));
            int end = (int) Math.floor(Math.sqrt(Integer.parseInt(input.split(" ")[1])));


            System.out.println(end-start+1);

        }
    }
        private static boolean isPerfectSquare(int no)
        {
            int sqrt = (int) Math.sqrt(no);

            if((no-(sqrt * sqrt)) == 0)
                return true;
            else
                return false;

        }

}
