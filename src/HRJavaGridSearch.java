import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by aravindd on 03/09/15.
 */
public class HRJavaGridSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int count = Integer.parseInt(in.nextLine());
        for (int i = 0; i < count; i++) {
            int[] msize = Arrays.stream(in.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int[][] mainArray = readArray(in, msize[0],msize[1]);
            int[] csize = Arrays.stream(in.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int[][] childArray = readArray(in, csize[0],csize[1]);
       }
   }
    private static int[][] readArray(Scanner in,int x, int y)
    {
        int[][] retArray = new int[x][y];
        for (int i = 0; i < x; i++) {
            String tc = in.nextLine();
            retArray[i] = Arrays.stream(tc.split("")).mapToInt(Integer::parseInt).toArray();
        }
        return retArray;

    }
    private static boolean gridSearch(int[][] mainArray, int[][] childArray)
    {
       int[] index = findFirstIndex(mainArray,childArray[0][0]);
        if (index[0] == -1)
            return false;

        if(index)

    }
    private static int[] findFirstIndex(int[][] mainArray, int value)
    {
        for (int i = 0; i < mainArray.length; i++) {
            for (int j = 0; j < mainArray[i].length; j++) {
                if (mainArray[i][j] == value)
                    return new int[]{i,j};
            }
        }
        return  new int[]{-1,-1};
    }
}
