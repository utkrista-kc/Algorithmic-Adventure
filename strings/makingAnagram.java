// hackerrank java

class Result {

    /*
     * Complete the 'makingAnagrams' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     * 1. STRING s1
     * 2. STRING s2
     */

    public static int makingAnagrams(String s1, String s2) {
        // Write your code here
        int frequency[] = new int[26];
        int totalCount = 0;
        for (int i = 0; i < s1.length(); i++) {
            frequency[s1.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s2.length(); i++) {
            frequency[s2.charAt(i) - 'a']--;
        }

        for (int i = 0; i < frequency.length; i++) {
            totalCount += Math.abs(frequency[i]);
        }
        return totalCount;
    }

}