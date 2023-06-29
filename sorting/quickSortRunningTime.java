// hackerrank

import java.io.*;
import java.util.*;

public class Solution {
    static int quickSortRunTime = 0;

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        int[] arrQuick = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
            arrQuick[i] = arr[i];
        }

        int insertionRunTime = insertionSortRunningTime(arr);
        quickSort(arrQuick, 0, (arr.length - 1));
        System.out.println(insertionRunTime - quickSortRunTime);

    }

    static void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            int partition = partition(arr, start, end);
            quickSort(arr, start, partition - 1);
            quickSort(arr, partition + 1, end);
        }
    }

    static int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int i = start - 1;
        for (int j = start; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;

                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                quickSortRunTime++;
            }

        }

        arr[end] = arr[i + 1];
        arr[i + 1] = pivot;
        quickSortRunTime++;
        return (i + 1);
    }

    public static int insertionSortRunningTime(int[] arr) {
        // Write your code here
        int totalSwaps = 0;
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
                totalSwaps++;
            }
            arr[j + 1] = key;
        }
        return totalSwaps;

    }
}