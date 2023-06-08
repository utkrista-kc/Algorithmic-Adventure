//hackerrank

class Result {

    /*
     * Complete the 'twoStrings' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     * 1. STRING s1
     * 2. STRING s2
     */

    public static String twoStrings(String s1, String s2) {
        // Write your code here
        Set<Character> s1Set = new HashSet<>();
        Set<Character> s2Set = new HashSet<>();
        for (char c : s1.toCharArray()) {
            s1Set.add(c);
        }
        for (char c : s2.toCharArray()) {
            s2Set.add(c);
        }
        s1Set.retainAll(s2Set);
        if (!s1Set.isEmpty()) {
            return "YES";
        }
        return "NO";
    }

}