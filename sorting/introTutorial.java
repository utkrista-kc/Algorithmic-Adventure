// hackerrank
class Result {

    /*
     * Complete the 'introTutorial' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     * 1. INTEGER V
     * 2. INTEGER_ARRAY arr
     */

    public static int introTutorial(int V, List<Integer> arr) {
        // Write your code here
        int result = -1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == V) {
                result = i;
                break;
            }
        }
        return result;
    }

}