package algorithms.easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        if (nums.length == 2) {
            return new int[] {0, 1};
        }

        Map<Integer, Integer> numbers = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (numbers.containsKey(diff)) {
                return new int[] {numbers.get(diff), i};
            }
            numbers.put(nums[i], i);
        }
        return new int[] {-1, -1};
    }
}
