import java.util.Collections;
import java.util.PriorityQueue;

class Solution {
    public static void main(String[] args) {
        if (lastStoneWeight(new int[]{2, 7, 4, 1, 8, 1}) == 1) {
            System.exit(0);
        } else {
            System.exit(1);
        }
    }

    public static int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        for (int i : stones) {
            q.add(i);
        }

        while (q.size() > 1) {
            var a = q.poll();
            var b = q.poll();
            if (a != b) {
                q.add(Math.abs(a - b));
            }
        }

        return q.size() > 0 ? q.poll() : 0;
    }
}