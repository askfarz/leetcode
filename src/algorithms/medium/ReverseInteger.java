package algorithms.medium;

public class ReverseInteger {

    public int reverse(int x) {
        long reverse = 0;
        while (x != 0) {
            int remainder = x % 10;
            reverse = reverse * 10 + remainder;
            x /= 10;
        }
        return reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE ? 0 : (int) reverse;
    }
}
