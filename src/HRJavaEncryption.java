import java.util.Scanner;

/**
 * Created by aravindd on 05/09/15.
 */
public class HRJavaEncryption {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        int length = input.length();;
        int rows = 0;
        int cols = 0;
        while(true)
        {
            rows = (int) Math.floor(Math.pow(length,0.5));
            cols = (int) Math.ceil(Math.pow(length,0.5));
            if (rows * cols >= length)
                break;
            else
                length = length + 1;

        }

        String[] result = new String[cols];

        System.out.println(rows + " " + cols);

        for (int i = 0; i < cols; i++) {
            result[i] = "";
            for (int j = 0; j < rows; j++) {
                int index = j * cols + i;


                if (index < length)
                    result[i] = result[i] + input.charAt(index);
            }
        }

        for (int i = 0; i < cols; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
