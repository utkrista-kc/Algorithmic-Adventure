class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        if (n < 3)
            return new ArrayList<>();
        Arrays.sort(nums);
        Set<List<Integer>> hashSet = new HashSet<>();
        for (int i = 0; i < n - 2; i++) {
            int num1 = nums[i];
            int left = i + 1;
            int right = n - 1;
            while (left < right) {
                int sum = num1 + nums[left] + nums[right];
                if (sum < 0) {
                    left++;
                } else if (sum > 0) {
                    right--;
                } else {
                    hashSet.add(Arrays.asList(num1, nums[left], nums[right]));
                    left++;
                    right--;
                }
            }
        }
        return new ArrayList<>(hashSet);
    }
}

/*
 * Time complexity: O(n^2)
 * Space complexity: O(n)
 */