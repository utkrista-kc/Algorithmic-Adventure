package greedy;

import java.util.Collections;
import java.util.List;

public class minAbsoluteDifference {
    /*
     * Complete the 'minimumAbsoluteDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int minimumAbsoluteDifference(List<Integer> arr) {
        // Write your code here
        Collections.sort(arr);
        int minimumAbsoluteDifference = Integer.MAX_VALUE;
        for (int i = 1; i < arr.size(); i++) {
            int diff = arr.get(i) - arr.get(i - 1);
            if (diff < minimumAbsoluteDifference)
                minimumAbsoluteDifference = diff;
        }
        return minimumAbsoluteDifference;
    }
}
