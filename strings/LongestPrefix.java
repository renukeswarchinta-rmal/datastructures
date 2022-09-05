package strings;

public class LongestPrefix {
    public static void main(String[] args) {
        System.out.println(longestPrefix(new String[]{"flower","flow","flight"}));
    }
    public static String longestPrefix(String[] strs){
        if(strs.length == 0) return "";
        String prefix = strs[0];
        for(int i = 1;i< strs.length; i++){
            while(strs[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0,prefix.length()-1);
                if(prefix.length() == 0) return  "";
            }
        }
        return prefix;
    }
}
