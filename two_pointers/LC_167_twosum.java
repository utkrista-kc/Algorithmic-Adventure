class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int left = 0;
        int right = numbers.length - 1;
        int[] result = new int[2];
        while (left < right && right > 0 && left < (numbers.length - 1)) {
            if ((numbers[left] + numbers[right]) < target) {
                left++;

            } else if ((numbers[left] + numbers[right]) > target) {
                right--;
            } else {
                result[0] = left + 1;
                result[1] = right + 1;
                break;
            }
        }
        return result;

    }
}
/*
 * Time Complexity: O(n) // Traverse number array once
 * Space Complexity: O(1)
 */