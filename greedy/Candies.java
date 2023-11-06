import java.util.Arrays;
import java.util.List;

public class Candies {

    /*
     * Complete the 'candies' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     * 1. INTEGER n
     * 2. INTEGER_ARRAY arr
     */

    public static long candies(int n, List<Integer> arr) {
    // Write your code here
        long[] result = new long[n];
        long minCandies = 0;
        Arrays.fill(result, 1); // Fill array with  1
        // forward logic
        for(int i=1;i<arr.size();i++) {
            if(arr.get(i) >arr.get(i-1)) {
                result[i] = result[i-1] + 1;
            }
        }
        // backward logic
        for(int i=arr.size() - 1;i>0;i--) {
            if(arr.get(i-1) > arr.get(i) && result[i-1] <= result[i]) {
                result[i-1] = result[i] + 1;
            }
        }
        
        // sum
        for(int i=0;i<result.length;i++) {
            minCandies += result[i];
        }
        
        return minCandies;
    
}
