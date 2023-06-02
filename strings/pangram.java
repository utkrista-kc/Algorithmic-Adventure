// Hackerrank

class Result {

    /*
     * Complete the 'pangrams' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String pangrams(String s) {
        // Write your code here
        Set<Character> charSet = new HashSet<>();
        int charCount = 0;
        for (int i = 0; i < s.length(); i++) {
            char strChar = Character.toLowerCase(s.charAt(i));
            if (strChar != ' ') {
                charSet.add(strChar);
            }
        }
        if (charSet.size() == 26) {
            return "pangram";
        }
        return "not pangram";
    }

}