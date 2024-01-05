package _300;

public class _300 {

    public static void main(String[] args) {
        int[] nums = new int[]{4,10,4,3,8,9};
        _300 t = new _300();
        t.lengthOfLIS(nums);
    }

    public int lengthOfLIS(int[] nums) {
        int res = 0;
        int n = nums.length;

        // dp[i] is the length of longest increasing
        // subsequence in the subarray 0...i
        int[] dp = new int[n];
        for (int i = 0; i < n; i++) {
            // get dp[i]
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j]+1);
                }
            }
            res = Math.max(res, dp[i]);
        }

        for (int i: dp) {
            System.out.println(i);
        }

        return res;
    }

}
