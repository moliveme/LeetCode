class Solution {
    public char nextGreatestLetter(char[] letters, char target) {

        char ret = '|';

        for (char ch : letters) {
            if ((ch > target) && (ch < ret)) {
                ret = ch;
            }
        }

        if (ret == '|') {
            ret = letters[0];
        }

        return ret;
        
    }
}