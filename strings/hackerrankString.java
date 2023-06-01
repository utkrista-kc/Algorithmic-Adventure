// Hackerrank

class Result {

    /*
     * Complete the 'hackerrankInString' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String hackerrankInString(String s) {
        // Write your code here
        String str = "hackerrank";
        int counter = 0;
        int strLen = str.length();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == str.charAt(counter)) {
                counter++;
            }
            if (counter == strLen - 1) {
                return "YES";
            }
        }
        if (counter != strLen - 1) {
            return "NO";
        }
        return "YES";
    }

}