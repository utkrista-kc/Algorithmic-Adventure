import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner input = new Scanner(System.in);
        int numQueries = Integer.parseInt(input.nextLine());
        MinHeap heap = new MinHeap();
        for (int i = 0; i < numQueries; i++) {
            String inputLine = input.nextLine();
            String[] splittedInput = inputLine.split(" ");
            int q = Integer.parseInt(splittedInput[0]);
            if (q == 1) {
                heap.add(Integer.parseInt(splittedInput[1]));
            } else if (q == 2) {
                heap.removeElement(Integer.parseInt(splittedInput[1]));
            } else {
                System.out.println(heap.getMinElement());
            }
        }
    }
}

class MinHeap {
    int size;
    int heap[];
    int capacity = 1000000;

    MinHeap() {
        size = 0;
        heap = new int[capacity];
    }

    public int getLeftChildIndex(int parentIndex) {
        return 2 * parentIndex + 1;
    }

    public int getRightChildIndex(int parentIndex) {
        return 2 * parentIndex + 2;
    }

    public int getParentIndex(int childIndex) {
        return (childIndex - 1) / 2;
    }

    public boolean hasLeftChild(int index) {
        return getLeftChildIndex(index) < size;
    }

    public boolean hasRightChild(int index) {
        return getRightChildIndex(index) < size;
    }

    public boolean hasParent(int index) {
        return getParentIndex(index) >= 0;
    }

    public int leftChild(int index) {
        return heap[getLeftChildIndex(index)];
    }

    public int rightChild(int index) {
        return heap[getRightChildIndex(index)];
    }

    public int parent(int index) {
        return heap[getParentIndex(index)];
    }

    public void swap(int indexOne, int indexTwo) {
        int temp = heap[indexOne];
        heap[indexOne] = heap[indexTwo];
        heap[indexTwo] = temp;
    }

    public int getMinElement() {
        if (size == 0)
            throw new IllegalStateException();
        return heap[0];
    }

    public int poll() {
        if (size == 0)
            throw new IllegalStateException();
        int item = heap[0];
        heap[0] = heap[size - 1];
        size--;
        heapifyDown(0);
        return item;
    }

    public void removeElement(int v) {
        int index = 0;
        while (index < size) {
            if (heap[index] == v) {
                break;

            } else {
                index++;
            }
        }
        heap[index] = heap[size - 1];
        size--;
        heapifyDown(index);
    }

    public void add(int item) {
        heap[size] = item;
        size++;
        heapifyUp();
    }

    public void heapifyUp() {
        int index = size - 1;
        while (hasParent(index) && parent(index) > heap[index]) {
            swap(getParentIndex(index), index);
            index = getParentIndex(index);
        }
    }

    public void heapifyDown(int index) {
        while (hasLeftChild(index)) {
            int smallerChildIndex = getLeftChildIndex(index);
            if (hasRightChild(index) && rightChild(index) < leftChild(index)) {
                smallerChildIndex = getRightChildIndex(index);
            }

            if (heap[index] < heap[smallerChildIndex]) {
                break;
            } else {
                swap(index, smallerChildIndex);
            }
            index = smallerChildIndex;
        }

    }
}
