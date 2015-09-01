import java.util.Scanner;

/**
 * Created by aravindd on 01/09/15.
 */
public class HRJavaLibFine {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] actual = in.nextLine().split(" ");
        String[] expected = in.nextLine().split(" ");

        int expyear = Integer.parseInt(expected[2]);
        int expmonth = Integer.parseInt(expected[1]);
        int expday = Integer.parseInt(expected[0]);

        int actyear = Integer.parseInt(actual[2]);
        int actmonth = Integer.parseInt(actual[1]);
        int actday = Integer.parseInt(actual[0]);


        if (actyear > expyear)
            System.out.println(10000);
        else if (actyear == expyear)
            if (actmonth > expmonth)
                System.out.println(500 * (actmonth-expmonth));
            else if (actmonth == expmonth)
                if (actday > expday)
                    System.out.println(15 * (actday-expday));
                else
                    System.out.println(0);
            else
                System.out.println(0);
        else
            System.out.println(0);


    }
}
