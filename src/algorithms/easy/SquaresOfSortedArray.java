package algorithms.easy;

public class SquaresOfSortedArray {

    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int indexNegative = -1;

        for (int i = 0; i < n; i++) {
            if (nums[i] >= 0) {
                break;
            }
            indexNegative = i;
        }

        int i = indexNegative + 1;
        int j = indexNegative;
        int indexArr = 0;
        int[] arr = new int[n];

        while (i < n && j >= 0) {
            if (pow(nums[i]) > pow(nums[j])) {
                arr[indexArr++] = pow(nums[j]);
                j -= 1;
            } else {
                arr[indexArr++] = pow(nums[i]);
                i += 1;
            }
        }

        while (i < n) {
            arr[indexArr++] = pow(nums[i]);
            i += 1;
        }

        while (j >= 0) {
            arr[indexArr++] = pow(nums[j]);
            j -= 1;
        }

        return arr;
    }

    private static int pow(int value) {
        return value * value;
    }
}
