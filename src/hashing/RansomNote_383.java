package hashing;

import java.util.HashMap;
import java.util.Map;

public class RansomNote_383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> count = new HashMap<>();

        for (char c : magazine.toCharArray()) {
            count.merge(c, 1, Integer::sum);
        }

        for (char c : ransomNote.toCharArray()) {
            if (!count.containsKey(c) || count.get(c) == 0) {
                return false;
            }
            count.merge(c, -1, Integer::sum);
        }

        return true;
    }
}
