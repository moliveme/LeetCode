class Solution {
    public String longestCommonPrefix(String[] strs) {

        int n = strs.length;
        char[][] char_arrays = new char[n][];
        for (int i = 0; i < n; i++) {
            char_arrays[i] = strs[i].toCharArray();
        }
        char[] prefix = char_arrays[0];
        int c = 0;

        for (int i = 0; i < n; i++) {

            while ((c < prefix.length) &&
                   (c < char_arrays[i].length) && 
                   (prefix[c] == char_arrays[i][c])) {

                    c++;
            }

            for (int j = c; j < prefix.length; j++) {
                System.out.println("deleting char");
                prefix[c] = 0;
            }
            
        }

        String str = String.valueOf(prefix);
        
        return str;
    }
}