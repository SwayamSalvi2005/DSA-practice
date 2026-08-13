package hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFreq {
    public int[] topKFrequent(int[] nums, int k) {

        // create hashmap
        HashMap<Integer, Integer> freq = new HashMap<>();

        // store element with frequencies
        for(int num: nums){
            freq.merge(num, 1, Integer:: sum);
        }

        // create priority queue | big to small
        PriorityQueue<int[]> pq = new PriorityQueue<>(
                (a,b) -> b[1] - a[1]
        );

        // add entires to prioity queue
        for(Map.Entry<Integer, Integer> entry : freq.entrySet()){
            pq.add(new int[]{entry.getKey(), entry.getValue()});
        }

        int[] result = new int[k];

        for(int i =0; i<k; i++){
            result[i] = pq.poll()[0];
        }

        return result;

    }
}
