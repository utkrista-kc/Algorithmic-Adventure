// hackerrank

class Result {

    /*
     * Complete the 'theLoveLetterMystery' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int theLoveLetterMystery(String s) {
        // Write your code here
        int minOperations = 0;
        int len = s.length();
        for (int i = 0; i < len / 2; i++) {
            int operationCount = Math.abs((int) s.charAt(i) - (int) s.charAt(len - i - 1));
            minOperations += operationCount;
        }
        return minOperations;
    }

}