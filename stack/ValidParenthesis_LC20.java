class Solution {
    public boolean isValid(String s) {
        Stack<Character> charStack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                charStack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (charStack.isEmpty()) {
                    return false;
                }
                if (c == ')' && charStack.peek() == '(') {
                    charStack.pop();
                } else if (c == '}' && charStack.peek() == '{') {
                    charStack.pop();
                } else if (c == ']' && charStack.peek() == '[') {
                    charStack.pop();
                } else {
                    return false;
                }
            }
        }
        if (!charStack.isEmpty()) {
            return false;
        }
        return true;
    }
}

/*
 * TC: O(n)
 * SC: O(n)
 */