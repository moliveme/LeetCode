import java.util.*;

class KthLargest {

    private int k;
    private int nums[];
    private int topk[];

    public KthLargest(int k, int[] nums) {
        this.k = k;
        this.nums = nums;
        Arrays.sort(nums);
        for (int i = 0; i < k; i++)
            this.topk[i] = nums[nums.length - i - 1];
    }

    public void setNums(int[] nums) {
        this.nums = nums;
    }

    public int[] getNums() {
        return nums;
    }

    public void setK(int k) {
        this.k = k;
    }

    public int getK() {
        return k;
    }

    public void setTopk(int[] topk) {
        this.topk = topk;
    }

    public int[] getTopk() {
        return topk;
    }

    // quicksort takes in low index and high index

    public void quicksort(int l, int h, int[] nums) {

        if (l < h) {
            // find pivot index

            // sort right

            // sort left
        }
        
    }
    
    // attempt 1

    public int add1(int val) {
        System.out.println(".....");

        int new_nums[] = new int[this.nums.length + 1];
        for (int i = 0; i < this.nums.length; i++)
            new_nums[i] = this.nums[i];
        
        new_nums[this.nums.length] = val;
        System.out.println("old this.nums"+Arrays.toString(this.nums));
        System.out.println("new_nums"+Arrays.toString(new_nums));
        setNums(new_nums);

        // int temp_nums[] = new int[this.nums.length];
        // for (int i = 0; i < this.nums.length; i++)
        //     temp_nums[i] = this.nums[i];

        // System.out.println("new this.nums/temp"+Arrays.toString(temp_nums));

        Arrays.sort(this.nums);

        System.out.println("sorted this.nums"+Arrays.toString(this.nums));

        return this.nums[this.nums.length - this.k];
    }

    // attempt 2

    public int add(int val) {

        // update this.nums by appending

        System.out.println(".....");

        int new_nums[] = new int[this.nums.length + 1];
        for (int i = 0; i < this.nums.length; i++)
            new_nums[i] = this.nums[i];
        
        new_nums[this.nums.length] = val;
        System.out.println("old this.nums"+Arrays.toString(this.nums));
        System.out.println("new_nums"+Arrays.toString(new_nums));
        setNums(new_nums);

        return 0;

    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */