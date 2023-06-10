// hackerrank

class Result {

    /*
     * Complete the 'bigSorting' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts STRING_ARRAY unsorted as parameter.
     */

    public static List<String> bigSorting(List<String> unsorted) {
        // Write your code here
        Collections.sort(unsorted, new Comparator<String>() {
            public int compare(String left, String right) {
                if (left.length() == right.length()) {
                    return left.compareTo(right);
                } else {
                    return left.length() - right.length();
                }
            }
        });
        return unsorted;
    }

}