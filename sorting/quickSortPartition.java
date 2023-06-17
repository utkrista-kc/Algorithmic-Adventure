//quicksort partition

class Result {

    /*
     * Complete the 'quickSort' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static List<Integer> quickSort(List<Integer> arr) {
        // Write your code here
        int i = 0;
        int j = arr.size();
        int pivot = arr.get(0);
        while (i < j && i <= arr.size() - 1) {
            do {
                i++;
            } while (arr.get(i) <= pivot);

            do {
                j--;
            } while (arr.get(j) >= pivot);
            if (i < j) {
                int i_value = arr.get(i);
                int j_value = arr.get(j);
                arr.set(i, j_value);
                arr.set(j, i_value);
            }
        }
        arr.set(0, arr.get(j));
        arr.set(j, pivot);
        System.out.println("arr " + arr);
        return arr;

    }

}
