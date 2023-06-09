
//hackerrank
class Result {

    /*
     * Complete the 'isValid' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String isValid(String s) {
        // Write your code here
        Map<Character, Integer> charFreq = new HashMap<>();

        for (char val : s.toCharArray()) {
            if (charFreq.containsKey(val)) {
                charFreq.put(val, charFreq.get(val) + 1);
            } else {
                charFreq.put(val, 1);
            }
        }
        System.out.println("char f: " + charFreq.values());
        int[] freq = new int[charFreq.size()];
        int idx = 0;
        for (Map.Entry<Character, Integer> entry : charFreq.entrySet()) {
            freq[idx++] = entry.getValue();
        }
        Arrays.sort(freq);
        int freqLen = freq.length;
        if (freq[0] == freq[freqLen - 1])
            return "YES";
        if (freq[0] == 1 && freq[1] == freq[freqLen - 1])
            return "YES";
        if (freq[0] == freq[freqLen - 2] && (freq[freqLen - 1] == freq[freqLen - 2] + 1))
            return "YES";
        return "NO";
    }
}
