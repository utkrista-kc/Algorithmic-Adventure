class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<String>();
        helper("", 0, 0, n, result);
        return result;
    }

    public void helper(String curr, int open, int closed, int n, List<String> result) {

        // base
        if (open == n && closed == n) {
            result.add(curr);
            return;
        }

        // add open
        if (open < n) {
            helper(curr + "(", open + 1, closed, n, result);
        }

        // add closed
        if (open > closed) {
            helper(curr + ")", open, closed + 1, n, result);
        }
    }
}