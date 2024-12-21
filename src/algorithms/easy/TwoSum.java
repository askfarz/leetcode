package algorithms.easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        if (nums.length == 2) {
            return new int[] {0, 1};
        }

        Map<Integer, Integer> temp = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer indexOfDiff = temp.get(target - nums[i]);
            if (temp.containsKey(indexOfDiff)) {
                return new int[] {i, indexOfDiff};
            }
            temp.put(nums[i], i);
        }
        return new int[] {0, 0};
    }
}
