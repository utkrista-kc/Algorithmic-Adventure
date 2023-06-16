// hackerrank

class Result {

    /*
     * Complete the 'insertionSort1' function below.
     *
     * The function accepts following parameters:
     * 1. INTEGER n
     * 2. INTEGER_ARRAY arr
     */

    public static void insertionSort1(int n, List<Integer> arr) {
        // Write your code here
        int key = arr.get(n - 1);
        int i = n - 2;
        while (i >= 0 && key < arr.get(i)) {
            arr.set(i + 1, arr.get(i));
            System.out.println(arr.stream().map(Object::toString).collect(joining(" ")));
            i = i - 1;
        }
        arr.set(i + 1, key);
        System.out.println(arr.stream().map(Object::toString).collect(joining(" ")));

    }

}