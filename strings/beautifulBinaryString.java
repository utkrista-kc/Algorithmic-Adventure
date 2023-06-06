//hackerrank 
class Result {

    /*
     * Complete the 'beautifulBinaryString' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING b as parameter.
     */

    public static int beautifulBinaryString(String b) {
        // Write your code here
        int start = 0;
        int end = b.length();
        int minCount = 0;
        while (start <= end - 3) {
            String subStr = b.substring(start, start + 3);
            if (subStr.equals("010")) {
                minCount++;
                start += 3;
            } else {
                start++;
            }
        }
        return minCount;

    }

}