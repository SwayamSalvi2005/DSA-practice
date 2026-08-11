package Strings;

public class LongestCommonPrefix_14 {
    public String longestCommonPrefix(String[] strs) {

        if(strs.length == 0){
            return "";
        }

        String first = strs[0];

        for(int i =0; i<strs.length; i++){

            StringBuilder common = new StringBuilder();

            int minLen = Math.min(first.length(), strs[i].length());

            for(int j =0; j<minLen; j++){
                if(first.charAt(j) == strs[i].charAt(j)){
                    common.append(first.charAt(j));
                }
                else{
                    break;
                }
            }

            first = common.toString();
            if(first.length() ==0){
                return "";
            }
        }

        return first;
    }
}
