import java.util.*;

/**
 * Created by aravindd on 04/09/15.
 */
public class HRJavaMStones {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int count = Integer.parseInt(in.nextLine());
        for (int i = 0; i < count; i++) {
            int n = Integer.parseInt(in.nextLine());
            int a = Integer.parseInt(in.nextLine());
            int b = Integer.parseInt(in.nextLine());

            Set<Integer> result = new TreeSet<Integer>();

            for (int j = 0; j < n; j++) {
                int endno = j * a + (n - 1 - j) * b;

                result.add(new Integer(endno));
            }


            for(Integer k : result)
            {
                System.out.print(k.intValue());
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
