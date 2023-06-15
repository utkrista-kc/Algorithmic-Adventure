// hackerrank

class Result {

    /*
     * Complete the 'downToZero' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */

    public static int downToZero(int n) {
        // Write your code here
        Queue<Integer> q = new LinkedList<>();
        int dp[] = new int[1000001];
        q.add(n);
        while (!q.isEmpty()) {
            int curr = q.poll();
            if (curr == 0) {
                break;
            }
            if (dp[curr - 1] == 0) {
                q.add(curr - 1);
                dp[curr - 1] = dp[curr] + 1;
            }

            for (int i = (int) Math.sqrt(curr); i >= 2; i--) {
                if (curr % i == 0 && dp[curr / i] == 0) {
                    q.add(curr / i);
                    dp[curr / i] = dp[curr] + 1;
                }
            }
        }
        return dp[0];
    }

}