
// Hackerrank
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
     * Complete the 'caesarCipher' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     * 1. STRING s
     * 2. INTEGER k
     */

    public static String caesarCipher(String s, int k) {
        // Write your code here
        String result = new String("");
        int charA = (int) 'A';
        int char_a = (int) 'a';
        for (int i = 0; i < s.length(); i++) {
            int charValue = s.charAt(i);
            if (Character.isUpperCase(charValue)) {
                int cipheredValue = ((charValue - charA) + (k % 26)) % 26;
                cipheredValue += charA;
                result += (char) cipheredValue;
            } else if (Character.isLowerCase(charValue)) {
                int cipheredValue = ((charValue - char_a) + (k % 26)) % 26;
                cipheredValue += char_a;
                result += (char) cipheredValue;
            } else {
                result += s.charAt(i);
            }
        }
        return result;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String s = bufferedReader.readLine();

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.caesarCipher(s, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
