
//hackerrank

class Result {

    /*
     * Complete the 'highestValuePalindrome' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     * 1. STRING s
     * 2. INTEGER n
     * 3. INTEGER k
     */

    public static String highestValuePalindrome(String s, int n, int k) {
        // Write your code here
        int mismatchCount = 0;
        char[] charArray = s.toCharArray();
        for (int i = 0; i < n / 2; i++) {
            if (charArray[i] != charArray[n - i - 1]) {
                char maxValue = (char) Math.max(charArray[i], charArray[n - i - 1]);
                charArray[i] = charArray[n - i - 1] = maxValue;
                k--;
            }
        }
        if (k < 0)
            return "-1";

        int start = 0;
        int end = n - 1;
        while (start <= end) {
            if (start == end && k > 0) {
                charArray[start] = '9';
                k--;
            }
            if (charArray[start] < '9') {
                if (k >= 2 && charArray[start] == s.charAt(start) && charArray[end] == s.charAt(end)) {
                    charArray[start] = '9';
                    charArray[end] = '9';
                    k -= 2;
                } else if (k >= 1 && (charArray[start] != s.charAt(start) || charArray[end] != s.charAt(end))) {
                    charArray[start] = '9';
                    charArray[end] = '9';
                    k--;
                }
            }

            start++;
            end--;
        }
        return String.valueOf(charArray);

    }

}