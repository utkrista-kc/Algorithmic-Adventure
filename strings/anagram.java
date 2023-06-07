//hackerrank
class Result {

    /*
     * Complete the 'anagram' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int anagram(String s) {
        // Write your code here
        int len = s.length();
        int mid = len / 2;
        if (len % 2 != 0) {
            return -1;
        }
        String firstWord = s.substring(0, mid);
        String secondWord = s.substring(mid, len);
        int difference = 0;
        int[] frequency = new int[26];

        for (int i = 0; i < firstWord.length(); i++) {
            int index = (int) firstWord.charAt(i) - (int) 'a';
            frequency[index]++;
        }

        for (int i = 0; i < secondWord.length(); i++) {
            int index = (int) secondWord.charAt(i) - (int) 'a';
            frequency[index]--;
        }

        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                difference += frequency[i];
            }
        }
        return difference;

    }

}