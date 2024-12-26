package algorithms.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public boolean containsDuplicate3(int[] nums) {
        Set<Integer> stash = new HashSet<>();
        for (int num : nums) {
            if (!stash.add(num)) {
                return true;
            }
        }
        return false;
    }

    public boolean containsDuplicate2(int[] nums) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }

    public boolean containsDuplicate1(int[] nums) {
        return Arrays.stream(nums)
                     .boxed()
                     .distinct()
                     .toList()
                     .size() < nums.length;
    }
}
