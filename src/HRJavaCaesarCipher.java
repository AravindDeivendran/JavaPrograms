import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by aravindd on 02/09/15.
 */
public class HRJavaCaesarCipher {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String count = in.nextLine();
        String text = in.nextLine();
        int key = Integer.parseInt(in.nextLine());

        char[] chars = text.toCharArray();
        int newChar = -1;
        String res = "";

        for(char cha : chars)
        {
            if ("abcdefghijklmnopqrstuvwxyz".indexOf(cha) != -1)
            {
                newChar = (int) cha + key % 26;

                if (newChar > 122)
                    newChar = newChar - 122 + 96;
                System.out.print((char) newChar);

            }
            else if ("ABCDEFGHIJKLMNOPQRSTUVWXYZ".indexOf(cha) != -1)
            {
                newChar = (int) cha + key % 26;

                if (newChar > 90)
                    newChar = newChar - 90 + 64;

                System.out.print((char) newChar);
            }
            else
                System.out.print(cha);
        }




    }
}
