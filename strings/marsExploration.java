//Hackerrank

class Result {

    /*
     * Complete the 'marsExploration' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int marsExploration(String s) {
        // Write your code here
        int changedLetterCount = 0;
        String expectedString = "SOS";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != expectedString.charAt(i % 3)) {
                changedLetterCount++;
            }
        }
        return changedLetterCount;
    }

}
