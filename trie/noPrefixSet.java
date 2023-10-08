import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'noPrefix' function below.
     *
     * The function accepts STRING_ARRAY words as parameter.
     */

    static class Node {
        Node[] children;
        boolean isEndOfWord;

        Node() {
            children = new Node[10];
            for (int i = 0; i < 10; i++) {
                children[i] = null;
            }
            isEndOfWord = false;
        }
    }

    public static void insert(Node root, String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            if (i == word.length() - 1) {
                curr.children[idx].isEndOfWord = true;
            }
            curr = curr.children[idx];
        }
    }

    public static boolean hasPrefix(Node root, String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (curr.children[idx] != null
                    && curr.children[idx].isEndOfWord) {
                return true;
            } else if (curr.children[idx] == null) {
                return false;
            } else if (i == word.length() - 1 && curr.children[idx] != null) {
                return true;
            }
            curr = curr.children[idx];

        }
        return false;
    }

    public static void noPrefix(List<String> words) {
        // Write your code here
        Node root = new Node();
        boolean isBadSet = false;
        for (String word : words) {
            // System.out.println("word: " + word);
            // System.out.println("has prefix: " + hasPrefix(root, word));
            if (!hasPrefix(root, word)) {
                insert(root, word);
                ;
            } else {
                System.out.println("BAD SET");
                System.out.println(word);
                isBadSet = true;
                break;
            }
        }
        if (!isBadSet) {
            System.out.println("GOOD SET");
        }

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> words = IntStream.range(0, n).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
                .collect(toList());

        Result.noPrefix(words);

        bufferedReader.close();
    }
}
