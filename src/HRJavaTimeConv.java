import java.util.Scanner;

/**
 * Created by aravindd on 30/08/15.
 */
public class HRJavaTimeConv {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.nextLine();

        String hour = time.split(":")[0];
        String min = time.split(":")[1];
        String sec = time.split(":")[2].substring(0, 1);

        String period = time.split(":")[2].substring(2);

        if (period == "AM")
            System.out.println(hour + min + sec);
        else {
            
            System.out.println(period);
        }



    }
}
