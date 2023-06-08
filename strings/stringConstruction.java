//hackerrrank

class Result {

    /*
     * Complete the 'stringConstruction' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int stringConstruction(String s) {
        // Write your code here
        int len = s.length();
        Set<Character> charSet = new HashSet<>();
        for (int i = 0; i < len; i++) {
            charSet.add(s.charAt(i));

        }
        return charSet.size();
    }

}
