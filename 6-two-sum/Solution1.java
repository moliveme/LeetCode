class Solution1 {
    public int[] twoSum(int[] nums, int target) {

        int n = nums.length;
        int[] ret = {0, 0};

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    ret[0] = i;
                    ret[1] = j;
                }
            }
        }
        
        return ret;
    }
}

