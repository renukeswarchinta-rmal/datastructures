package strings;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithOutRepeating {
    public static void main(String[] args) {
        System.out.println(findLogestSubString("abcaefghji"));
    }
    public static int findLogestSubString(String s){
        int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>(); // current index of character
        // try to extend the range [i, j]
        for (int right = 0, left = 0; right < n; right++) {
            if (map.containsKey(s.charAt(right))) {
                left = Math.max(map.get(s.charAt(right)), left);
            }
            ans = Math.max(ans, right - left + 1);
            map.put(s.charAt(right), right + 1);
        }
        return ans;
    }
}
// abcaefghji