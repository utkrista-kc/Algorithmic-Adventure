//hackerrank

class Result {

    /*
     * Complete the 'funnyString' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String funnyString(String s) {
        // Write your code here
        int sLen = s.length();
        int[] strAscii = new int[sLen];
        int[] revStrAscii = new int[sLen];
        for (int i = 0; i < sLen; i++) {
            int ascii = s.charAt(i);
            strAscii[i] = ascii;
            revStrAscii[sLen - 1 - i] = ascii;
        }

        for (int i = 0; i < sLen - 1; i++) {
            if (Math.abs(strAscii[i] - strAscii[i + 1]) != Math.abs(revStrAscii[i] - revStrAscii[i + 1])) {
                return "Not Funny";
            }
        }
        return "Funny";
    }

}