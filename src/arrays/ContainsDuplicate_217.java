package arrays;

import java.util.HashSet;

public class ContainsDuplicate_217 {

    public boolean containsDuplicate(int[] nums) {

        int n = nums.length;

        boolean verdict = false;

        HashSet<Integer> set = new HashSet<>();

        for(int i =0; i<n; i++){
            if(set.contains(nums[i])){
                verdict = true;
            }

            set.add(nums[i]);
        }

        return verdict;

    }
}
