class Solution {
    public boolean isPalindrome(String s) {
        int n = s.length();
        if (n <= 1) {
            return true;
        }
        int leftCounter = 0;
        int rightCounter = s.length() - 1;
        while (leftCounter < rightCounter) {

            char leftChar = s.charAt(leftCounter);
            char rightChar = s.charAt(rightCounter);
            while (leftCounter < rightCounter && !Character.isLetterOrDigit(leftChar)) {
                leftCounter++;
                leftChar = s.charAt(leftCounter);
            }
            while (rightCounter > leftCounter && !Character.isLetterOrDigit(rightChar)) {
                rightCounter--;
                rightChar = s.charAt(rightCounter);
            }
            if (Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)) {
                return false;
            }
            leftCounter++;
            rightCounter--;
        }
        return true;
    }
}

/*
 * Time complexity: O(n) - Entire string is traversed once
 * Space complexity: O(1)- No extra memory for the string
 */