import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by aravindd on 03/09/15.
 */
public class HRJavaCavityMap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int count = Integer.parseInt(in.nextLine());
        int[][] input = new int[count][count];
        String[][] result = new String[count][count];

        for (int i = 0; i < count; i++) {
            String tc = in.nextLine();
            input[i] = Arrays.stream(tc.split("")).mapToInt(Integer::parseInt).toArray();
        }

        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
            if(i > 0 && j > 0 && i < count - 1 && j < count - 1)
            {
                int value = input[i][j];
                if(input[i-1][j] < value && input[i][j-1] < value && input[i+1][j] < value && input[i][j+1] < value)
                    result[i][j] = "X";
                else {
                    result[i][j] = String.valueOf(input[i][j]);
                }
            }
            else {
                result[i][j] = String.valueOf(input[i][j]);
            }
            }

        }

        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                System.out.print(result[i][j]);
            }
            System.out.println();
        }
    }
}
