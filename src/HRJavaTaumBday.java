import java.util.Scanner;

/**
 * Created by aravindd on 05/09/15.
 */
public class HRJavaTaumBday {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = Integer.parseInt(in.nextLine());

        for (int i = 0; i < count; i++) {
            String[] input = in.nextLine().split(" ");
            long B = Long.parseLong(input[0]);
            long W = Long.parseLong(input[1]);

            input = in.nextLine().split(" ");

            long X = Long.parseLong(input[0]);
            long Y = Long.parseLong(input[1]);
            long Z = Long.parseLong(input[2]);

            long costBwithoutconv = B * X;
            long costWwithoutconv = W * Y;

            long costBwithconv = B * (Y + Z);
            long costWwithconv = W * (X + Z);

            long total = (costBwithconv > costBwithoutconv ? costBwithoutconv : costBwithconv) + (costWwithconv > costWwithoutconv ? costWwithoutconv : costWwithconv);

            System.out.println(total);

        }

    }
}
