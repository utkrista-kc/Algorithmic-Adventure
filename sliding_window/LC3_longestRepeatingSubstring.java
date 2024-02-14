class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLen = 0;
        Set<Character> charSet = new HashSet<>();
        int left = 0;
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            while (charSet.contains(currentChar)) {
                charSet.remove(s.charAt(left));
                left++;
            }
            charSet.add(currentChar);
            maxLen = Math.max(maxLen, charSet.size());
        }
        return maxLen;
    }
}

/*
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */