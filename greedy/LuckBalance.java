package greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LuckBalance {
    /*
     * Complete the 'luckBalance' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     * 1. INTEGER k
     * 2. 2D_INTEGER_ARRAY contests
     */

    public static int luckBalance(int k, List<List<Integer>> contests) {
        int luckBalance = 0;
        ArrayList<Integer> importantLuck = new ArrayList<Integer>();
        for (List<Integer> contest : contests) {
            System.out.println(contest);
            luckBalance += contest.get(0);
            if (contest.get(1) != 0) {
                importantLuck.add(contest.get(0));
            }
        }
        Collections.sort(importantLuck);
        int loseLuckSize = importantLuck.size() - k;
        if (loseLuckSize != 0) {
            for (int i = 0; i < loseLuckSize; i++) {
                luckBalance -= 2 * importantLuck.get(i);
            }
        }

        return luckBalance;

    }
}
