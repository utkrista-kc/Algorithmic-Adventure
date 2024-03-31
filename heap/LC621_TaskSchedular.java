class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int totalInterval = 0;
        for (int i = 0; i < tasks.length; i++) {
            int index = tasks[i] - 'A';
            freq[index]++;
        }

        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0)
                pq.add(freq[i]);
        }

        while (!pq.isEmpty()) {
            ArrayList<Integer> temp = new ArrayList<>();
            for (int i = 1; i <= n + 1; i++) {
                if (!pq.isEmpty()) {
                    int value = pq.poll();
                    value--;
                    temp.add(value);
                }
            }
            for (Integer item : temp) {
                if (item != 0) {
                    pq.add(item);
                }
            }

            if (pq.isEmpty()) {
                totalInterval += temp.size();
            } else {
                totalInterval += (n + 1);
            }

        }
        return totalInterval;

    }
}

/*
 * Time Complexity: O(n) to count all tasks, log(size) - log(26) priority queue.
 * Those overall time complexity: O(n)
 * Space complexity: O(1)
 */