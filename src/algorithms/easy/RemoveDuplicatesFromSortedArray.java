package algorithms.easy;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {
        int k = nums.length;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                k--;
                nums[i] = 101;
            }
        }
        Arrays.sort(nums);
        return k;
    }
}
