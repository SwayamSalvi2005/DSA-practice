package Strings;

import java.util.HashMap;

public class FirstUnique_387 {
    public int firstUniqChar(String s) {

        int n = s.length();

        HashMap<Character, Integer> count = new HashMap<>();

        for(char c: s.toCharArray()){
            count.merge(c, 1, Integer::sum);
        }

        for(int i=0; i<n; i++){
            if(count.get(s.charAt(i)) == 1){
                return i;
            }
        }

        return -1;


    }
}
