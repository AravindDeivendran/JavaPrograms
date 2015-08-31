import java.util.Scanner;

/**
 * Created by aravindd on 30/08/15.
 */
public class HRJavaStairCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ctr = Integer.parseInt(in.nextLine());

        for (int i = 0; i < ctr; i++) {
            for (int j = 0; j < ctr-i-1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i+1; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
