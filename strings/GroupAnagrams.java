package strings;

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        System.out.println(groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"}));
    }
    public static List<List<String>> groupAnagrams(String[] strArray){
        Map<String,List<String>> map = new HashMap<>();
        for(String word: strArray){
            char[] ca = word.toCharArray();
            Arrays.sort(ca);
            String str = new String(ca);
            if(!map.containsKey(str)){
                map.put(str,new ArrayList<>());
            }
            map.get(str).add(word);
        }
        return new ArrayList<>(map.values());
    }
}
