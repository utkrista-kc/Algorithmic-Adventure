// hackerrank

class Result {

    /*
     * Complete the 'countingSort' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static List<Integer> countingSort(List<Integer> arr) {
        // Write your code here
        List<Integer> result = new ArrayList<>();
        List<Integer> finalResult = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            result.add(0);
        }
        for (int i = 0; i < arr.size(); i++) {
            int arrValue = arr.get(i);
            result.set(arrValue, result.get(arrValue) + 1);
        }

        for (int i = 0; i < result.size(); i++) {
            int count = result.get(i);
            while (count > 0) {
                finalResult.add(i);
                count--;
            }
        }
        return finalResult;

    }

}