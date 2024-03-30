class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < stones.length; i++) {
            pq.add(stones[i]);
        }
        while (pq.size() > 1) {
            int firstValue = pq.poll();
            int secondValue = pq.poll();
            if (firstValue != secondValue) {
                pq.add(firstValue - secondValue);
            }
        }
        if (pq.size() < 1) {
            return 0;
        }
        return pq.peek();
    }
}