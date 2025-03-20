package algorithms.easy;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

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

    public static int removeDuplicates2(int[] nums) {
        Set<Integer> uniqueElements = new LinkedHashSet<>();

        for (int num : nums) {
            uniqueElements.add(num);
        }

        Iterator<Integer> iterator = uniqueElements.iterator();
        for (int i = 0; i < nums.length && iterator.hasNext(); i++) {
            nums[i] = iterator.next();
        }
        return uniqueElements.size();
    }

    public static int removeDuplicates3(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int i = 0, j = 0, n = nums.length;

        while (j < n) {
            if (nums[i] != nums[j]) {
                nums[++i] = nums[j];
            }
            j++;
        }
        return i + 1;
    }
}
