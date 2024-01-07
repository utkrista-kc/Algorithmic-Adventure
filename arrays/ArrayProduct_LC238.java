class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] left = new int[nums.length];

        left[0] = 1;

        for (int i = 1; i < nums.length; i++) {
            left[i] = nums[i - 1] * left[i - 1];
        }

        int[] right = new int[nums.length];
        right[nums.length - 1] = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            right[i] = right[i + 1] * nums[i + 1];
        }

        int[] result = new int[nums.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = left[i] * right[i];
        }
        return result;

    }
}

/*
 * Time Complexity: O(n)
 * space: O(1)
 */

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = 1;
        int productAllAfterCurrent = 1;

        for (int i = 1; i < nums.length; i++) {
            result[i] = nums[i - 1] * result[i - 1];
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            result[i] *= productAllAfterCurrent;
            productAllAfterCurrent *= nums[i];
        }

        return result;

    }
}

/*
 * space complexity: O(1)
 */