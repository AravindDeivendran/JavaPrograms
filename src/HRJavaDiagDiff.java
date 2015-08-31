import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by aravindd on 28/08/15.
 */
public class HRJavaDiagDiff {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ctr = Integer.parseInt(in.nextLine());
        int dia1 = 0;
        int dia2 = 0;
        for (int i = 0; i < ctr; i++) {

            String line = in.nextLine();
            int[] nos = Arrays.stream(line.split(" ")).mapToInt(Integer::parseInt).toArray();
            dia1 = dia1 + nos[i];
            dia2 = dia2 + nos[ctr - i - 1];


        }


        System.out.println(Math.abs(dia1 - dia2));

    }
}