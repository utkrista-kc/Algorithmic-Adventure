
//hackerrank 
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        int[] arr = new int[n];
        int[] result = new int[100];
        int maxValue = -1;
        for (int i = 0; i < n; i++) {
            String value = input.nextLine();
            String splittedValue = value.split(" ")[0];
            arr[i] = Integer.parseInt(splittedValue);
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        int[] arrFreq = new int[maxValue + 1];
        for (int j = 0; j < n; j++) {
            int value = arr[j];
            arrFreq[value] = arrFreq[value] + 1;
        }

        for (int k = 0; k < 100; k++) {
            if (k == 0) {
                result[k] = arrFreq[k];
            } else if (k <= maxValue) {
                result[k] = result[k - 1] + arrFreq[k];
            } else {
                result[k] = result[k - 1];
            }
        }
        for (int k = 0; k < 100; k++) {
            System.out.print(result[k] + " ");
        }
    }
}