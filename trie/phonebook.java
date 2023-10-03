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
     * Complete the 'contacts' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts 2D_STRING_ARRAY queries as parameter.
     */

    static class Node {
        Node[] children;
        int count;

        public Node() {
            children = new Node[26];
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
            count = 0;
        }
    }

    static Node root = new Node();

    public static void insert(Node root, String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
            curr.count++;
        }
    }

    public static int search(Node root, String key) {
        Node curr = root;
        int count = 0;
        for (int i = 0; i < key.length(); i++) {
            int idx = key.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                return 0;
            }
            curr = curr.children[idx];

        }
        return curr.count;
    }

    public static List<Integer> contacts(List<List<String>> queries) {
        // Write your code here
        List<Integer> result = new ArrayList<>();
        System.out.println("queries" + queries);
        for (List<String> innerList : queries) {
            if (innerList.get(0).equals("add")) {
                System.out.println("added: " + innerList.get(1));
                insert(root, innerList.get(1));
            } else if (innerList.get(0).equals("find")) {
                result.add(search(root, innerList.get(1)));
            }
        }
        return result;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int queriesRows = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<String>> queries = new ArrayList<>();

        IntStream.range(0, queriesRows).forEach(i -> {
            try {
                queries.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .collect(toList()));
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        List<Integer> result = Result.contacts(queries);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining("\n"))
                        + "\n");

        bufferedReader.close();
        bufferedWriter.close();
    }
}
