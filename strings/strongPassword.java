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
     * Complete the 'minimumNumber' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     * 1. INTEGER n
     * 2. STRING password
     */

    public static int minimumNumber(int n, String password) {
        // Return the minimum number of characters to make the password strong
        int minCharacters = 0;

        if (!containSpecialCharacter(password)) {
            minCharacters++;
        }
        if (!containUpperCase(password)) {
            minCharacters++;
        }
        if (!containLowerCase(password)) {
            minCharacters++;
        }
        if (!containNumber(password)) {
            minCharacters++;
        }
        while ((minCharacters + n) < 6) {
            minCharacters++;
        }
        return minCharacters;
    }

    private static boolean containSpecialCharacter(String str) {
        return str.matches(".*[!@#$%^&*\\(\\)\\-+].*");
    }

    private static boolean containUpperCase(String str) {
        return str.matches(".*[A-Z].*");

    }

    private static boolean containLowerCase(String str) {
        return str.matches(".*[a-z].*");
    }

    private static boolean containNumber(String str) {
        return str.matches(".*[0-9].*");
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String password = bufferedReader.readLine();

        int answer = Result.minimumNumber(n, password);

        bufferedWriter.write(String.valueOf(answer));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
