package Strings;

import java.util.HashMap;

public class isAnagram_242 {
    public boolean isAnagram(String s, String t) {

        HashMap<Character, Integer> count = new HashMap<>();

        // for string s
        for(char c : s.toCharArray()){
            count.merge(c, 1, Integer::sum);
        }

        // for string t
        for(char c: t.toCharArray()){
            count.merge(c, -1, Integer::sum);
        }

        for(int v: count.values()){
            if(v !=0){
                return false;
            }
        }
        return true;

    }
}
