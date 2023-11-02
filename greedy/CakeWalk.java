package greedy;

import java.util.Collections;
import java.util.List;

public class CakeWalk {
    /*
     * Complete the 'marcsCakewalk' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts INTEGER_ARRAY calorie as parameter.
     */

    public static long marcsCakewalk(List<Integer> calorie) {
        // Write your code here
        Collections.sort(calorie, Collections.reverseOrder());
        long minMiles = 0;
        for (int i = 0; i < calorie.size(); i++) {
            minMiles += Math.pow(2, i) * calorie.get(i);
        }

        return minMiles;

    }
}
