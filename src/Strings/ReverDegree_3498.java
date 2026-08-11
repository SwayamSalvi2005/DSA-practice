package Strings;

public class ReverDegree_3498 {
    public int reverseDegree(String s) {

        int total =0;

        for(int i =0; i<s.length(); i++){

            int normalPos = s.charAt(i) -'a' +1;
            int reversePos = 27 - normalPos;

            int index = i+1;

            total += index*reversePos;
        }

        return total;
    }
}
