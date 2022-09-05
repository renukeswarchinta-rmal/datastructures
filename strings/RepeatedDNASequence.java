package strings;

import java.util.*;

public class RepeatedDNASequence {
    public static void main(String[] args) {
        System.out.println(List.of(findRepeatedDNASequence("AAAAAACCCCCAACCCCCCCCCCCAAAAACCCCCC")));
        System.out.println(List.of(findRepeatedDNASequenceWithSet("AAAAAACCCCCAACCCCCCCCCCCAAAAACCCCCC")));
    }
    // Below method uses HashMap
    public static List<String> findRepeatedDNASequence(String s){
        Map<String,Integer> map = new HashMap<>();
        for(int i =0;i<=s.length() -10;i++){
            String subString = s.substring(i,i+10);
            map.put(subString,map.getOrDefault(subString,0)+1);
        }
        List<String> result = new ArrayList<>();
        for(Map.Entry<String,Integer> item: map.entrySet()){
            if(item.getValue() > 1){
                result.add(item.getKey());
            }
        }
        return result;

    }

    public static List<String> findRepeatedDNASequenceWithSet(String s){
        Set<String> set = new HashSet<>();
        List<String> repeatedStrings = new ArrayList<>();
        for(int i=0;i<s.length() - 10;i++){
            String subString = s.substring(i,i+10);
            if(set.contains(subString)){
                repeatedStrings.add(subString);
            }else {
                set.add(subString);
            }
        }
        return repeatedStrings;
    }
}
