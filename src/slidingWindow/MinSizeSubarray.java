package slidingWindow;

public class MinSizeSubarray {
    public int minSubArrayLen(int target, int[] nums) {

        int left=0;
        int right =0;
        int sum =0;
        int minLength = Integer.MAX_VALUE;
        int n = nums.length;

        for(int i = right; i<n; i++){

            sum += nums[i];

            while(sum >= target){

                minLength = Math.min(minLength, (i-left) +1);

                sum -= nums[left];

                left++;
            }
        }

        if(minLength == Integer.MAX_VALUE){
            return 0;
        }
        else{
            return minLength;
        }

    }

}
