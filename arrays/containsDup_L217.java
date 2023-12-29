class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> keyMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (keyMap.containsKey(nums[i])) {
                return true;
            }
            keyMap.put(nums[i], 1);
        }
        return false;
    }
}

/*
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */