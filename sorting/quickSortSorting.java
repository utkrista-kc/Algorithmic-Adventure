//hackerrank

import java.util.*;

public class Solution {

    static void quickSort(int[] ar, int low, int high) {
        if ((high - low) < 1)
            return;
        int partition = partition2(ar, low, high);
        quickSort(ar, low, partition - 1);
        quickSort(ar, partition + 1, high);
        if (sorted(ar, low, high)) {
            printArray(ar, low, high);
        }

    }

    static boolean sorted(int[] ar, int lo, int hi) {
        for (int i = lo; i < hi - 1; i++) {
            if (ar[i] > ar[i + 1])
                return false;
        }
        return true;
    }

    static int partition(int[] ar, int low, int high) {
        int pivot = ar[low];
        int i = low + 1;
        int j = high;
        while (i <= j) {
            while (i <= high && ar[i] <= pivot) {
                i++;
            }
            while (j > low && ar[j] >= pivot) {
                j--;
            }

            if (i < j) {
                int temp = ar[i];
                ar[i] = ar[j];
                ar[j] = temp;
            }
        }
        ar[low] = ar[j];
        ar[j] = pivot;
        return j;
    }

    static int partition2(int[] ar, int lo, int hi) {
        int[] copy = Arrays.copyOfRange(ar, lo, hi + 1);

        int pivot = copy[0];
        int pivotIndex = 0;
        int left = lo;
        for (int i = 0; i < copy.length; i++) {
            if (copy[i] < pivot) {
                ar[left++] = copy[i];
            }
        }
        pivotIndex = left++;
        ar[pivotIndex] = pivot;
        for (int i = 0; i < copy.length; i++) {
            if (copy[i] > pivot)
                ar[left++] = copy[i];
        }

        return pivotIndex;
    }

    static void printArray(int[] ar, int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.print(ar[i] + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = in.nextInt();
        }
        quickSort(ar, 0, ar.length - 1);
    }
}
