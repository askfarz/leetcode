package algorithms.util;

import java.util.Arrays;
import java.util.Scanner;

public class SearchUtil {

    public static void main(String[] args) {
        int[] numbers = new int[] {1, 12, -1, 4, 5, 5, 5, 17, 100, 11, 0, -10, 99, 45};

        assert linearSearch(numbers, 5) == 4;

        Arrays.sort(numbers);
        //System.out.println(Arrays.toString(numbers));
        assert leftBinarySearch(numbers, 5) == 5;
        assert leftBinarySearch(numbers, 7) == 8;

        assert rightBinarySearch(numbers, 5) == 7;
        assert rightBinarySearch(numbers, 7) == 7;

        Scanner scannerIn = new Scanner(System.in);
        int size = scannerIn.nextInt();
        String space = scannerIn.nextLine();
        int[] arr = Arrays.stream(scannerIn.nextLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();

        int mpos = 1000;
        for (int x : arr) {
            if (0 < x && x < 1000) mpos = x;
        }
        System.out.println(mpos);
    }

    // O(N)
    public static int linearSearch(int[] arr, int target) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                index = i;
                break;
            }
        }
        return index;
    }

    // O(logN)
    // если значения нет алгоритм дает индекс первого элемента, который больше данного.
    public static int leftBinarySearch(int[] sortedArr, int target) {
        int l = -1;
        int r = sortedArr.length - 1;
        while (l + 1 != r) {
            int mid = (l + r) / 2;
            if (sortedArr[mid] < target) {
                l = mid;
            } else {
                r = mid;
            }
        }
        return r;
    }

    // O(logN)
    // если значения нет алгоритм дает индекс последнего элемента, который меньше данного.
    public static int rightBinarySearch(int[] sortedArr, int target) {
        int l = 0;
        int r = sortedArr.length;
        while (l + 1 != r) {
            int mid = (l + r) / 2;
            if (sortedArr[mid] > target) {
                r = mid;
            } else {
                l = mid;
            }
        }
        return l;
    }
}
