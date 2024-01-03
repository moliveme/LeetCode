package _2610;

import java.util.*;

public class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> ret = new ArrayList<>();
        int n = nums.length;
        // elements are between 1 and nums.length inclusive

        int[] dups = new int[n];
        // dups[i] is # of occurrences of i+1

        // first pass to find num rows needed
        int rows = 0;
        for (int i = 0; i < n; i++) {
            dups[nums[i]-1]++;
            if (dups[nums[i]-1] > rows) {
                rows = dups[nums[i]-1];
            }
        }

        // empty dups for second pass
        dups = new int[n];
        // initialize rows in list
        for (int i=0; i < rows; i++) {
            ret.add(new ArrayList<Integer>());
        }

        // second pass: iterate through nums, update dups and add to ret
        for (int i = 0; i < n; i++){
            ret.get(dups[nums[i]-1]).add(nums[i]);
            dups[nums[i]-1]++;
        }
        return ret;
    }
}
