public class LongestConsecSeq_LC128 {

}

class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int longest = 0;
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        for (int num : nums) {
            if (!numSet.contains(num - 1)) {
                int currNum = num;
                int longestLength = 1;
                while (numSet.contains(currNum + 1)) {
                    longestLength++;
                    currNum++;
                }
                longest = Math.max(longest, longestLength);
            }
        }
        return longest;
    }
}

/*
 * Time complexity: O(n)
 * Space complexity: O(n)
 */