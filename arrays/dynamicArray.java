//hackerrank

class Result {

    /*
     * Complete the 'dynamicArray' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     * 1. INTEGER n
     * 2. 2D_INTEGER_ARRAY queries
     */

    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
        // Write your code here
        System.out.println("n: " + n);
        System.out.println("queries: " + queries);
        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr.add(new ArrayList<>());
        }

        int lastAnswer = 0;

        List<Integer> answers = new ArrayList<>();

        for (List<Integer> q : queries) {
            int queryType = q.get(0);
            int x = q.get(1);
            int y = q.get(2);
            int idx = ((x ^ lastAnswer) % n);

            if (queryType == 1) {
                arr.get(idx).add(y);
            } else {
                lastAnswer = arr.get(idx).get(y % arr.get(idx).size());
                answers.add(lastAnswer);
            }
        }

        return answers;
    }

}