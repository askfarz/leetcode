package algorithms.easy;

public class PlusOne {

    public static int[] plusOne(int[] digits) {
        int plusOne = 1;
        for (int i = digits.length - 1; i >= -1; i--) {
            if (plusOne == 0) {
                return digits;
            }

            if (i < 0) {
                int[] extendDigits = new int[digits.length + 1];
                extendDigits[0] = plusOne;
                System.arraycopy(digits, 0, extendDigits, 1, digits.length);
                return extendDigits;
            }

            plusOne += digits[i];
            if (plusOne > 9) {
                digits[i] = plusOne % 10;
            } else {
                digits[i] = plusOne;
            }
            plusOne /= 10;
        }

        return digits;
    }

    public static int[] plusOne1(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] extDigits = new int[digits.length + 1];
        extDigits[0] = 1;
        return extDigits;
    }

}
