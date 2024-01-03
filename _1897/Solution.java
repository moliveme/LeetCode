package _1897;

class Solution {
    public boolean makeEqual(String[] words) {
        boolean result = true;
        int n = words.length;
        int[] counts = new int[26];
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                counts[(int)words[i].charAt(j) % 97]++;
            }
        }
        for (int c:counts) {
            if (c % n != 0) {
                result = false;
            }
        }
        return result;
    }
}