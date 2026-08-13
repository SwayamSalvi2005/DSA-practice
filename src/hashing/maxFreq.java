package hashing;

import java.util.HashMap;

public class maxFreq {
    public int maxFrequencyElements(int[] nums) {

        HashMap<Integer, Integer> freq = new HashMap<>();


        for(int num: nums){
            freq.merge(num, 1, Integer::sum);
        }

        int maxFreq =0;
        for(int count: freq.values()){
            if(count>maxFreq){
                maxFreq = count;
            }
        }

        int result=0;
        for(int v: freq.values()){
            if(v == maxFreq){
                result += v;
            }
        }

        return result;

    }
}
