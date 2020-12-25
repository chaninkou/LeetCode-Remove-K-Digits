package leetcode402;

import java.util.Stack;

public class RemoveLowerDigits {
    public String removeKdigits(String num, int k) {
        int len = num.length();
        
        if(k == len){
            return "0";
        }    
            
        Stack<Character> stack = new Stack<>();
        
        int i = 0;
        
        // Remove all the digits that is lower here.
        while(i < len){
            // when current < previous, discard previous
            while(k > 0 && !stack.isEmpty() && stack.peek() > num.charAt(i)){
                stack.pop();
                k--;
            }
            
            stack.push(num.charAt(i));
            i++;
        }
        
        
        // Edge case with all same digit
        while(k > 0){
            stack.pop();
            k--;            
        }
        
        StringBuilder sb = new StringBuilder();
        
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        
        // Remove all the leading zero
        while(sb.length() > 1 && sb.charAt(sb.length() - 1) == '0'){
            // Only take constant time to remove last digit, without shifting
            sb.deleteCharAt(sb.length() - 1);
        }

        return sb.reverse().toString();
    }
}
