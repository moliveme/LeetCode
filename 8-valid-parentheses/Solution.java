import java.util.*;

class Solution {

    public boolean isValid(String s) {
        
        Stack<Character> STACK = new Stack<Character>();

        int n = s.length();
        char[] s_arr = s.toCharArray();
        char popped;

        for (int i = 0; i < n; i++) {
            if ((s_arr[i] == '(')
                || (s_arr[i] == '[')
                || (s_arr[i] == '{')) { // if open, push

                STACK.push(s_arr[i]);

            } else { // if closed, pop and compare

                try {
                    popped = STACK.pop();
                } catch (EmptyStackException e) {
                    return false;
                }
                
                if ((s_arr[i] - popped != 1) &&
                    (s_arr[i] - popped != 2)) {

                    return false;

                }

            }
        }
        return STACK.isEmpty();
    }
}