package algorithms.easy;

public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {
        if (target > nums[nums.length - 1]) {
            return nums.length;
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }

            if (target < nums[i]) {
                return i;
            }
        }
        return 0;
    }
}
