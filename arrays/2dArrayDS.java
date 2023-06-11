//hackerrank

class Result {

    /*
     * Complete the 'hourglassSum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int hourglassSum(List<List<Integer>> arr) {
        // Write your code here
        int maxSum = Integer.MIN_VALUE;
        List<Integer> sumValues = new ArrayList<>();
        for (int i = 0; i <= arr.size() - 3; i++) {
            for (int j = 1; j <= arr.get(i).size() - 2; j++) {
                int sum = arr.get(i).get(j) + arr.get(i).get(j - 1) + arr.get(i).get(j + 1) +
                        arr.get(i + 1).get(j) + arr.get(i + 2).get(j) + arr.get(i + 2).get(j - 1)
                        + +arr.get(i + 2).get(j + 1);
                sumValues.add(sum);
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }
        return maxSum;
    }

}