import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Equal {

    /*
     * Complete the 'equal' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int equal(List<Integer> arr) {
        int minVal = Collections.min(arr);
        int minOperations = Integer.MAX_VALUE;
        for (int target = minVal; target >= minVal - 4; target--) {
            int operations = 0;
            for (int value : arr) {
                int diffVal = value - target;
                operations += diffVal / 5 + (diffVal % 5) / 2 + ((diffVal % 5) % 2);

            }
            minOperations = Math.min(minOperations, operations);
        }
        return minOperations;
    }

}