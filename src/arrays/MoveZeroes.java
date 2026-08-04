package arrays;

public class MoveZeroes {

    public void moveZeroes(int[] nums) {

        int firstZero = -1;

        for(int i =0; i<nums.length; i++){
            if(nums[i] ==0){
                firstZero = i;
                break;
            }
        }

        if(firstZero !=-1){
            for(int i = firstZero+1; i<nums.length; i++){
                if(nums[i] != 0){
                    int temp = nums[i];
                    nums[i] = nums[firstZero];
                    nums[firstZero] = temp;
                    firstZero++;
                }
            }
        }
    }

}
