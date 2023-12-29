class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        ;
        Map<Integer, Integer> keyMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (keyMap.containsKey(diff)) {
                ans[0] = i;
                ans[1] = keyMap.get(diff);
                break;
            }
            keyMap.put(nums[i], i);
        }
        return ans;
    }
}

/*
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */