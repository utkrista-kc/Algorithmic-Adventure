class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> keyMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char key = s.charAt(i);
            if (keyMap.containsKey(key)) {
                int initialCount = keyMap.get(key);
                keyMap.put(key, initialCount + 1);
            } else {
                keyMap.put(key, 1);
            }

        }
        for (int i = 0; i < t.length(); i++) {
            char key = t.charAt(i);
            if (keyMap.containsKey(key)) {
                int count = keyMap.get(key);
                if (count < 1) {
                    return false;
                }
                keyMap.put(key, count - 1);
            } else {
                return false;
            }
        }
        for (Character key : keyMap.keySet()) {
            if (keyMap.get(key) != 0) {
                return false;
            }
        }
        return true;
    }
}
/*
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */