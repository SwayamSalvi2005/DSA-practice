package slidingWindow;

import java.util.HashSet;

public class LongestSubstring_3 {
    public int lengthOfLongestSubstring(String s) {

        int n = s.length();
        int left = 0;
        int maxLength = Integer.MIN_VALUE;

        HashSet<Character> word = new HashSet<>();

        for(int right =0; right<n; right++){

            while(word.contains(s.charAt(right))){
                word.remove(s.charAt(left));
                left++;
            }

            word.add(s.charAt(right));
            maxLength = Math.max(maxLength, (right-left) +1);
        }

        return maxLength;

    }
}
