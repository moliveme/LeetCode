class Solution {
/*
    public void addOne(int[] ar, int index) {

        // base case
        if ((Math.abs((ar[index] + 1) - ar[index - 1]) <= 1) &&
            (Math.abs((ar[index] + 1) - ar[index + 1]) <= 1)) {
                ar[index] = ar[index] + 1;
                return;
        }

        addOne(ar, index);
    }

    public int maxValue1(int n, int index, int maxSum) {

        int[] ar = new int[n];

        for (int i = 0; i < n; i++) {
            ar[i] = 1;
        }
        
        for (int i = 0; i < maxSum - n; i++) {
            this.addOne(ar, index);
        }

        return ar[index];
    }
*/

// gives the right answer but exceeds time limit
    public int maxValue(int n, int index, int maxSum) {

        int to_distribute = maxSum - n;
        int left_index = index - 1;
        int right_index = index + 1;
        int max = 1;
        int ones_needed = 1;

        while (to_distribute >= ones_needed) {
            max++;
            to_distribute -= ones_needed;
            if (left_index >= 0) {
                ones_needed++;
            }
            if (right_index <= n - 1) {
                ones_needed++;
            }
            left_index--;
            right_index++;
        }

        return max;
    }
}