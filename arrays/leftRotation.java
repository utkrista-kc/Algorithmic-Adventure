// hackerrank

class Result {

    /*
     * Complete the 'rotateLeft' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     * 1. INTEGER d
     * 2. INTEGER_ARRAY arr
     */

    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        // Write your code here
        for (int i = 0; i < d % arr.size(); i++) {
            int start = arr.get(0);
            arr.remove(0);
            arr.add(start);
        }
        return arr;

    }

}
