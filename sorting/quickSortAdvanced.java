import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        quickSort(arr, 0, (arr.length - 1));
    }

    static void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            System.out.println("quick sort = " + start + "end= " + end);
            int partition = partition(arr, start, end);
            quickSort(arr, start, partition - 1);
            quickSort(arr, partition + 1, end);

        }
    }

    static int partition(int[] arr, int start, int end) {
        System.out.println("start= " + start + "end " + end);
        int pivot = arr[end];
        int i = start;
        int j = end - 1;
        while (i < j && i <= end && j >= start) {
            while (arr[i] <= pivot && i <= end - 1) {
                i++;
            }
            while (arr[j] >= pivot && j >= start) {
                j--;
            }
            System.out.println("i= " + i + "j= " + j);
            if (i < j) {
                System.out.println("inside swap");
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                printArray(arr);
            }
        }
        arr[end] = arr[j + 1];
        arr[j + 1] = pivot;
        System.out.println("whole swap");
        printArray(arr);
        return j + 1;
    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
