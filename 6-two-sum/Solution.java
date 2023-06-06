import java.util.*;

class hash_el {
    private int num;
    private int index;

    hash_el(int num, int index) {
        this.num = num;
        this.index = index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getIndex() {
        return index;
    }

    public int getNum() {
        return num;
    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {

        int n = nums.length;
        int[] ret = {0, 0};

        int[] nums_sorted = new int[n];

        for (int i = 0; i < n; i++) {
            nums_sorted[i] = nums[i];
        }

        Arrays.sort(nums_sorted);

        int set_size = nums_sorted[n - 1] - nums_sorted[0] + 1;

        hash_el[] hash_set = new hash_el[set_size];

        for (int i = 0; i < set_size; i++) {
            hash_set[i] = new hash_el(0, -1);
        }

        // populate hash set

        int m;

        for (int i = 0; i < n; i++) {
            m = nums[i] % set_size;
            if (m < 0) {
                hash_set[set_size + m].setNum(nums[i]);
                hash_set[set_size + m].setIndex(i);
            } else {
                hash_set[m].setNum(nums[i]);
                hash_set[m].setIndex(i);
            }
        }
        
        // find complement in the set

        int match_index = 0;

        for (int i = 0; i < n; i++) {
            m = (target - nums[i]) % set_size;

            if (m < 0) {
                match_index = hash_set[set_size + m].getIndex();
            } else {
                match_index = hash_set[m].getIndex();
            }

            if ((match_index != -1)
                && (match_index != i)) {
                ret[0] = i;
                ret[1] = match_index;
                break;      
            }
        }

        return ret;
    }

    public static void main(String[] args) {
        System.out.println(5 % 2);
    }
}