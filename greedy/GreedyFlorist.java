package greedy;

import java.util.Arrays;

public class GreedyFlorist {

    // Complete the getMinimumCost function below.
    static int getMinimumCost(int k, int[] c) {
        Arrays.sort(c);
        int length = c.length;
        int round = 0;
        int totalMinCost = 0;
        // Sorting array in reverse order
        for (int i = 0; i < length / 2; i++) {
            int temp = c[i];
            c[i] = c[length - 1 - i];
            c[length - 1 - i] = temp;
        }

        for (int i = 0; i < length; i++) {
            if (i % k == 0)
                round++;
            totalMinCost += round * c[i];
        }
        return totalMinCost;

    }

}
