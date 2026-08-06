package arrays;

import java.util.ArrayList;
import java.util.List;

public class findDuplicates_442 {

    public List<Integer> findDuplicates(int[] nums) {

        List<Integer> answer = new ArrayList<>();

        int n = nums.length;

        for(int i =0; i<n; i++){
            int index = Math.abs(nums[i]) -1;

            if(nums[index] <0){
                answer.add(index +1);
            }
            nums[index] *= -1;
        }

        return answer;

    }
}
