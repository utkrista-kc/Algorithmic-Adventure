// hackerrank 

class Result {

    /*
     * Complete the 'palindromeIndex' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int palindromeIndex(String s) {
        // Write your code here
        if (isPalindrome(s)) {
            return -1;
        }
        int len = s.length();
        for (int i = 0; i < len / 2; i++) {
            if (s.charAt(i) != s.charAt(len - i - 1)) {
                String subStr = s.substring(0, i) + s.substring(i + 1);
                boolean isSubtringPalindrome = isPalindrome(subStr);
                if (isSubtringPalindrome) {
                    return i;
                } else {
                    return len - i - 1;
                }
            }

        }
        return -1;
    }

    private static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;
        while (start <= end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

}