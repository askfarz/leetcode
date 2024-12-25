package algorithms.easy;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {

    public int singleNumber(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        Map<Integer, Integer> stash = new HashMap<>();
        for (int num : nums) {
            if (stash.containsKey(num)) {
                stash.remove(num);
            } else {
                stash.put(num, 1);
            }
        }
        return stash.keySet().iterator().next();
    }
}
