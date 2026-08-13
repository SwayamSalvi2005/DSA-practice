package twoPointer;

public class ContainerWater_11 {
    public int maxArea(int[] height) {

        int left =0;
        int right = height.length-1;

        int maxi=0;


        while(left<right){

            int width = right - left;

            int hei = Math.min(height[left], height[right]);

            int area = hei*width;

            maxi = Math.max(maxi, area);

            if(height[left] < height[right]){
                left++;
            }
            else{
                right--;
            }


        }


        return maxi;


    }
}
