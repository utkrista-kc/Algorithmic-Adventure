// hackerrank

class Result {

    /*
     * Complete the 'gemstones' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING_ARRAY arr as parameter.
     */

    public static int gemstones(List<String> arr) {
        // Write your code here
        Set<Character> charSet = new HashSet<>();

        for (char charValue : arr.get(0).toCharArray()) {
            charSet.add(charValue);
        }
        for (int i = 1; i < arr.size(); i++) {
            Set<Character> tempSet = new HashSet<>();
            for (char c : arr.get(i).toCharArray()) {
                if (charSet.contains(c)) {
                    tempSet.add(c);
                }
            }
            charSet = tempSet;
        }
        int gemstonesCount = charSet.size();
        return gemstonesCount;
    }

}