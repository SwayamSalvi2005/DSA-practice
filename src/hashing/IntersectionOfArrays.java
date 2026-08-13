package hashing;

import java.util.HashSet;

public class IntersectionOfArrays {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> set = new HashSet<>();

        for(int n1 : nums1){
            set.add(n1);
        }

        HashSet<Integer> result = new HashSet<>();

        for(int n2: nums2){
            if(set.contains(n2)){
                result.add(n2);
            }
        }

        int[] ans = new int[result.size()];
        int i =0;
        for(int n3: result){
            ans[i] = n3;
            i++;
        }

        return ans;

    }
}
