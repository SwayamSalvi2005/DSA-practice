package Strings;

import java.util.PriorityQueue;

public class LongestHappyString_1405 {
    public String longestDiverseString(int a, int b, int c) {

        PriorityQueue<int[]> pq = new PriorityQueue<>(
                (x, y) -> y[1] - x[1]
        );


        if (a > 0) pq.add(new int[]{0, a});
        if (b > 0) pq.add(new int[]{1, b});
        if (c > 0) pq.add(new int[]{2, c});


        StringBuilder sb = new StringBuilder();
        char[] chars = {'a', 'b', 'c'};

        while (!pq.isEmpty()) {

            int[] max = pq.poll();
            int idx = max[0];
            int count = max[1];


            int len = sb.length();
            if (len >= 2 &&
                    sb.charAt(len - 1) == chars[idx] &&
                    sb.charAt(len - 2) == chars[idx]) {


                if (pq.isEmpty()) break;

                int[] second = pq.poll();
                sb.append(chars[second[0]]);
                second[1]--;

                if (second[1] > 0) pq.add(second);
                pq.add(max);
            } else {

                sb.append(chars[idx]);
                count--;

                if (count > 0) {
                    pq.add(new int[]{idx, count});
                }
            }
        }

        return sb.toString();
    }
}
