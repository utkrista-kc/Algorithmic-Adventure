// hackerrank

class Result {

    /*
     * Complete the 'getMax' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts STRING_ARRAY operations as parameter.
     */

    public static List<Integer> getMax(List<String> operations) {
        // Write your code here
        Stack<Integer> itemStack = new Stack<Integer>();
        Stack<Integer> maxStack = new Stack<Integer>();
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < operations.size(); i++) {
            String[] splittedString = operations.get(i).split(" ");
            int query = Integer.parseInt(splittedString[0]);
            if (query == 1) {
                int x = Integer.parseInt(splittedString[1]);
                itemStack.push(x);
                if (maxStack.isEmpty()) {
                    maxStack.push(x);
                } else {
                    int top = maxStack.peek();
                    if (top < x) {
                        maxStack.push(x);
                    } else {
                        maxStack.push(top);
                    }
                }
            } else if (query == 2) {
                itemStack.pop();
                maxStack.pop();
            } else if (query == 3) {

                result.add(maxStack.peek());
            }

        }
        return result;
    }

}