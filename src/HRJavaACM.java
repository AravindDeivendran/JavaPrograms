import java.util.*;

/**
 * Created by aravindd on 04/09/15.
 */
public class HRJavaACM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        int persons = Integer.parseInt(input.split(" ")[0]);
        int topics = Integer.parseInt(input.split(" ")[1]);
        BitSet[] b = new BitSet[persons];

        for (int i = 0; i < persons; i++) {
            String[] l = in.nextLine().split("");
            b[i] = new BitSet(topics);
            for (int j = 0; j < l.length; j++) {
                if (l[j].equals("1"))
                    b[i].set(j);
            }

        }
        int max = 0;


        ArrayList<Integer> maxteam = new ArrayList<Integer>();
        ArrayList<String> res = new ArrayList<String>();

        for (int i = 0; i < persons; i++) {
            for (int j = i+1; j < persons; j++) {

                BitSet r = (BitSet) b[i].clone();
                r.or(b[j]);

                if(r.cardinality() > max) {
                    max = r.cardinality();
                    maxteam = new ArrayList<Integer>();
                    res = new ArrayList<String>();
                    maxteam.add(max);

                }

                else if (r.cardinality() == max)
                {
                    maxteam.add(r.cardinality());
                    res.add(i + " " + j);
                    System.out.println(res);
                }
                r = null;
            }
        }
        System.out.println(max);
        System.out.println(maxteam.size());

    }
}
