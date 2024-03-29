class Solution {
    public int findMin(int[] nums) {
        int minNum = nums[0];
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            if (nums[left] <= nums[right]) {
                minNum = Math.min(nums[left], minNum);
                break;
            }

            int mid = left + ((right - left) / 2);
            minNum = Math.min(nums[mid], minNum);
            if (nums[mid] >= nums[left]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return minNum;
    }

}
