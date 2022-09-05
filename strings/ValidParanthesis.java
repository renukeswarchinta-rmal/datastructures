package strings;

import java.util.HashMap;
import java.util.Stack;

public class ValidParanthesis {
    private  HashMap<Character, Character> mappings;
    public ValidParanthesis(){
        this.mappings = new HashMap<Character, Character>();
        this.mappings.put(')', '(');
        this.mappings.put('}', '{');
        this.mappings.put(']', '[');

    }
    public static void main(String[] args) {
        ValidParanthesis validParanthesis = new ValidParanthesis();
       // char[] c = new char[]{'(',')','[',']','[','{','}'};
        char[] c = new char[]{'(',')','[',']','{','}'};
        System.out.println(validParanthesis.isValid(new String(c)));
    }

    public  boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(this.mappings.containsKey(c)){
                char topElement = stack.isEmpty() ? '#' : stack.pop();
                if(topElement != this.mappings.get(c)){
                    return false;
                }
            }else {
                stack.push(c);
            }
        }
        return true;
    }
}
//if map contains element in the string ; pop element from stack; check popedlement is value presnet in map; if that is not equal return false
