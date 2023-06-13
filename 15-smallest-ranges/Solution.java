import java.util.ArrayList;
class Solution {
    public ArrayList<String> summaryRanges(int[] nums) {

        ArrayList<String> res = new ArrayList<>();
        int start = nums[0];
        int end = nums[0];

        for (int i = 0; i < nums.length; i++) {

            if ((i == nums.length - 1) || (nums[i + 1] != nums[i] + 1)) {
                end = nums[i];
                if (start != end) {
                    System.out.println("if" + Integer.toString(start) + "->" + Integer.toString(end));
                    res.add(Integer.toString(start) + "->" + Integer.toString(end));
                } else {
                    System.out.println("else" + Integer.toString(start));
                    res.add(Integer.toString(start));
                }
                start = nums[i + 1];
            }

        }
        
        return res;
    }
}