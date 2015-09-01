import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by aravindd on 01/09/15.
 */
public class HRJavaSherlockH {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = Integer.parseInt(in.nextLine());

        for (int i = 0; i < count; i++) {
            int input = Integer.parseInt(in.nextLine());
            int five = findFive(input);

            if (five == -1)
                System.out.println("-1");
            else if (input % 3 == 0 && input / 3 == five) {

                System.out.println(new String(new char[input]).replace("\0", "5"));
            }
            else {
                System.out.print(new String(new char[five * 3]).replace("\0", "5"));
                System.out.print(new String(new char[input-(five * 3)]).replace("\0", "3"));
                System.out.println();
            }

        }

    }
    private static int findFive(int input)
    {
        int three = input % 3;
        int five = input / 3;

        if (three == 0)
            return five;

        for (int i = five; i >= 0 ; i--) {
            int rem = input - (3 * i);
            if (rem % 5 == 0)
                return i;

        }
        return -1;
    }
}
