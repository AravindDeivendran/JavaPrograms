import java.util.Scanner;

/**
 * Created by aravindd on 05/09/15.
 */
public class HRJavaTimeinWords {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int hour = in.nextInt();
        int min = in.nextInt();

        if (min == 60) {
            min = 0;
            hour = hour == 12 ? 1 : hour + 1;
        }

        if (min == 0)
            System.out.println(getWords(hour) + " o' clock");
        else if (min == 1)
            System.out.println("one minute past " + getWords(hour));
        else if (min == 15)
            System.out.println("quarter past " + getWords(hour));
        else if (min < 15 || (min > 15 && min < 30))
            System.out.println(getWords(min) + " minutes past " + getWords(hour));
        else if (min == 30)
            System.out.println("half past " + getWords(hour));
        else if (min < 45 || (min > 45 && min < 58))
            System.out.println(getWords(60-min) + " minutes to " + getWords(hour == 12 ? 1: hour + 1));
        else if (min == 45)
            System.out.println("quarter to " + getWords(hour == 12 ? 1: hour + 1));
        else if (min == 59)
            System.out.println("one minute to " + getWords(hour == 12 ? 1: hour + 1));

        else
            System.out.println("Unknown");

    }
    private static String getWords(int number)
    {
        String[] tens = new String[]{"zero","ten","twenty","thirty","fourty"};
        String[] lessThanTen = new String[]{"zero","one","two","three","four","five","six","seven","eight","nine"};
        String[] twenties = new String[]{"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};

        if (number % 10 == 0)
            return tens[number/10];
        else if (number < 10)
            return lessThanTen[number];
        else if (number < 20)
            return twenties[number-10];
        else
            return tens[number/10] + " " + lessThanTen[number%10];



    }
}
