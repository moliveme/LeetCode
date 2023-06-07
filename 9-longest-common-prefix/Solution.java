class Solution {
    public String longestCommonPrefix(String[] strs) {

        char[][] char_arrays = {};
        int n = strs.length;
        for (int i = 0; i < n; i++) {
            char_arrays[i] = strs[i].toCharArray();
        }
        char[] prefix = char_arrays[0];
        int c = 0;

        for (int i = 0; i < n; i++) {

            while ((c < prefix.length)) {

            }
            
        }
        
        return prefix.toString();
    }
}