import java.util.ArrayList;
class Solution {
    public ArrayList<String> summaryRanges(int[] nums) {

        ArrayList<String> res = new ArrayList<>();
        int start = nums[0];
        int end = nums[0];

        for (int i = 0; i < nums.length; i++) {

            start = nums[i];

            if (nums[i + 1] != nums[i] + 1) {
                end = nums[i];
                if (start != end) {
                    res.add(Integer.toString(start) + "->" + Integer.toString(end));
                } else {
                    res.add(Integer.toString(start));
                }
            }

        }
        
        return res;
    }
}