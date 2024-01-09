class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].equals("+")) {
                System.out.println("inside");
                int temp = stack.pop() + stack.pop();
                stack.push(temp);
            } else if (tokens[i].equals("-")) {
                int temp1 = stack.pop();
                int temp2 = stack.pop();
                stack.push(temp2 - temp1);
            } else if (tokens[i].equals("*")) {
                int temp1 = stack.pop();
                int temp2 = stack.pop();
                stack.push(temp2 * temp1);
            } else if (tokens[i].equals("/")) {
                int temp1 = stack.pop();
                int temp2 = stack.pop();
                stack.push(temp2 / temp1);
            } else {
                stack.push(Integer.parseInt(tokens[i]));
            }
        }
        return stack.peek();
    }
}

/*
 * Time complexity: O(1)
 * Space complexity: O(n)
 */