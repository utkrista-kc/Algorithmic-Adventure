
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
        System.out.println("string: " + s);
        int mismatchCount = 0;
        char[] charArray = s.toCharArray();
        for (int i = 0; i < n / 2; i++) {
            if (charArray[i] != charArray[n - i - 1]) {
                mismatchCount += 1;
            }
        }

        System.out.println("mismatch: " + mismatchCount);

        if (k < mismatchCount) {
            return "-1";
        }
        int start = 0;
        int end = n - 1;

        while (start <= end) {
            if (k < 1) {
                break;
            }
            if (charArray[start] != charArray[end]) {
                if (k > 1 && (k - 2) >= mismatchCount - 1) {
                    if (charArray[start] != '9') {
                        charArray[start] = '9';
                        k--;
                    }
                    if (charArray[end] != '9') {
                        charArray[end] = '9';
                        k--;
                    }

                } else {
                    if (charArray[start] > charArray[end]) {
                        charArray[end] = charArray[start];
                    } else {
                        charArray[start] = charArray[end];
                    }
                    k--;
                }
                mismatchCount--;
            } else {
                if (k > 1 && (k - 2) >= mismatchCount && charArray[start] != '9') {
                    charArray[start] = '9';
                    charArray[end] = '9';
                    k -= 2;
                }
            }
            if (start == end && k > 0) {
                charArray[start] = '9';
                k--;
            }
            start++;
            end--;
        }

        s = String.valueOf(charArray);
        System.out.println("resulting string: " + s);
        boolean isPalindrome = isPalindrome(s);
        return isPalindrome ? s : "-1";

    }

    public static boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        while (start <= end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

}
