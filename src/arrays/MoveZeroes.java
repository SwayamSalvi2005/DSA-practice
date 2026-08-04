package arrays;

public class MoveZeroes {

    public static void moveZeroes(int[] nums) {

        int n = nums.length;
        int firstZero = 0;

        for(int i =0; i<n; i++){
            if(nums[i] == 0){
                firstZero = i;
                break;
            }
        }

        for(int i = firstZero+1; i<n; i++){
            if(nums[i] !=0){
                int temp = nums[i];
                nums[i] = nums[firstZero];
                nums[firstZero] = temp;
                firstZero++;
            }
        }

    }

    public static void main(String[] args) {


        int []arr = {4,0,2,4,0,0,8,0};
        moveZeroes(arr);
    }
}
