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
        String sec = time.split(":")[2].substring(0, 2);

        String period = time.split(":")[2].substring(2);


        System.out.println(","+ period+",");
        if (period.equals("AM")) {
            if (hour.equals("12"))
                System.out.println("00:00:00");
            else
                System.out.println(hour + ":" + min + ":" + sec);
        }
        else if (period.equals("PM")) {
            hour = String.valueOf((Integer.parseInt(hour) + 12));

            System.out.println(hour + ":" + min + ":" + sec);
        }



    }
}
