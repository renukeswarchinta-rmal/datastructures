package strings;

import java.util.Stack;

public class DecodeString {

    public static void main(String[] args) {
        String s = "2[a2[bc2[d]]]";  // bcdd // bcdd bcdd abcdd abcdd
        System.out.println(decode(s));
    }
    public static String decode(String s){
        Stack<Integer> countStack = new Stack<>();
        Stack<String> wordStack = new Stack<>();
        int number = 0;

        StringBuilder word = new StringBuilder();
        for(int i =0;i<s.length();i++){
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                number = number * 10 + (c - '0'); //
            }else if(Character.isLetter(c)){
                word.append(c);
            }else if(c == '['){
                countStack.push(number);
                wordStack.push(word.toString());
                number =0;
                word = new StringBuilder();
            }else {
                int count = countStack.pop();
                StringBuilder duplicateWord = new StringBuilder(wordStack.pop());
                for(int j =0;j<count;j++){
                    duplicateWord.append(word);
                }
                word = duplicateWord;
            }
        }
        return word.toString();
    }
}
