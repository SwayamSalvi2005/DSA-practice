package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class mergeIntervals_56 {
    public int[][] merge(int[][] intervals) {

        int n = intervals.length;


        // if interval arry is empty
        if(n==0){
            return new int[0][];
        }

        // sort the intervals
        Arrays.sort(intervals, (a, b) ->{
            return a[0] -b[0];
        });


        // create ArrayList to store merged intervals
        List<int[]> mergedList = new ArrayList<>();

        mergedList.add(intervals[0]);


        for(int i =1; i<n; i++){

            int[] lastInterval = mergedList.get(mergedList.size()-1);

            int[] currentInterval = intervals[i];

            if(currentInterval[0] <= lastInterval[1]){
                lastInterval[1] = Math.max(currentInterval[1], lastInterval[1]);
            }
            else{
                mergedList.add(currentInterval);
            }
        }

        return mergedList.toArray(new int[mergedList.size()][]);
    }
}
