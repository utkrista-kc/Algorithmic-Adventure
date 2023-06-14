// hackerrank

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner input = new Scanner(System.in);
        int q = Integer.parseInt(input.nextLine());
        Stack<Integer> firstStack = new Stack<Integer>();
        Stack<Integer> secondStack = new Stack<Integer>();
        for (int i = 0; i < q; i++) {
            String value = input.nextLine();
            String[] operation = value.split(" ");
            int queryType = Integer.parseInt(operation[0]);
            if (queryType == 1) {
                firstStack.push(Integer.parseInt(operation[1]));
            } else if (queryType == 2) {
                if (!secondStack.isEmpty()) {
                    secondStack.pop();
                } else {
                    Iterator<Integer> stackVal = firstStack.iterator();
                    while (stackVal.hasNext()) {
                        secondStack.push(firstStack.pop());
                    }
                    secondStack.pop();
                }

            } else if (queryType == 3) {
                if (!secondStack.isEmpty()) {
                    System.out.println(secondStack.peek());
                } else {
                    Iterator<Integer> stackVal = firstStack.iterator();
                    while (stackVal.hasNext()) {
                        secondStack.push(firstStack.pop());
                    }
                    System.out.println(secondStack.peek());
                }
            }
        }
    }
}