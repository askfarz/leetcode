package algorithms.easy;

public class ValidMountainArray {

    public boolean validMountainArray(int[] arr) {
        int n = arr.length;
        if (n < 3) {
            return false;
        }

        int indLeftInc = -1;
        int indRightInc = n;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i + 1] > arr[i]) {
                indLeftInc = i + 1;
            } else {
                break;
            }
        }

        for (int i = n - 1; i > 0; i--) {
            if (arr[i - 1] > arr[i]) {
                indRightInc = i - 1;
            } else {
                break;
            }
        }

        return indLeftInc == indRightInc;
    }
}
