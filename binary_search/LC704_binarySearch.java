class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        int result = -1;
        while (left <= right) {
            int mid = (right + left) / 2;
            if (target == nums[mid]) {
                result = mid;
                break;
            } else if (target < nums[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }

        }
        return result;
    }
}

/*
 * 
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */