//hackerrank

class Result {

    /*
     * Complete the 'gameOfThrones' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String gameOfThrones(String s) {
        // Write your code here
        HashMap<Character, Integer> charFrequency = new HashMap<>();
        for (char c : s.toCharArray()) {

            if (charFrequency.containsKey(c)) {
                charFrequency.put(c, charFrequency.get(c) + 1);
            } else {
                charFrequency.put(c, 1);
            }
        }
        int totalOddCharFreq = 0;
        for (Map.Entry<Character, Integer> entry : charFrequency.entrySet()) {
            int value = entry.getValue();
            if (value % 2 != 0) {
                totalOddCharFreq++;
            }
        }
        if (totalOddCharFreq > 1) {
            return "NO";
        }
        return "YES";

    }

}
