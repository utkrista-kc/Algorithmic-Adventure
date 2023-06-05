// Hackerrank
class Result {

    /*
     * Complete the 'separateNumbers' function below.
     *
     * The function accepts STRING s as parameter.
     */

    public static void separateNumbers(String s) {
        // Write your code here
        boolean isValid = false;
        String initialNum = "";
        for (int i = 1; i <= s.length() / 2; i++) {
            initialNum = s.substring(0, i);
            Long num = Long.parseLong(initialNum);
            String subString = "";
            while (subString.length() < s.length()) {
                subString += Long.toString(num++);
            }
            if (s.equals(subString)) {
                isValid = true;
                break;
            }
        }
        System.out.println(isValid ? "YES " + initialNum : "NO");

    }

}
