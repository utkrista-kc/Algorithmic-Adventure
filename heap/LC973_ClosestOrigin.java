class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int[][] result = new int[k][2];
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> a[0] - b[0]);

        for (int[] pair : points) {
            int dist = (int) (Math.pow(pair[0], 2) + Math.pow(pair[1], 2));
            int[] heapPair = new int[] { dist, pair[0], pair[1] };
            minHeap.add(heapPair);
        }

        int count = 0;
        while (k > 0) {
            int[] removedPair = minHeap.poll();
            int[] pair = new int[] { removedPair[1], removedPair[2] };
            result[count++] = pair;
            k--;
        }
        return result;

    }
}

/*
 * Time complexity O(n log k)
 * Space complexity O(n)
 */