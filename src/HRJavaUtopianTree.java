import java.util.Scanner;

/**
 * Created by aravindd on 01/09/15.
 */
public class HRJavaUtopianTree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = Integer.parseInt(in.nextLine());

        for (int i = 0; i < count; i++) {
            int input = Integer.parseInt(in.nextLine());
            System.out.println(getTreeSize(input));

        }
    }
    private static int getTreeSize(int cycle)
    {
        if (cycle == 0)
            return 1;

        if (cycle % 2 == 0)
            return getTreeSize(cycle - 1) + 1;
        else
            return 2 * getTreeSize(cycle - 1);
    }

}
