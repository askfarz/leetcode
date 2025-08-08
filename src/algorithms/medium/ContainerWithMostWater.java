package algorithms.medium;

public class ContainerWithMostWater {

    public static void main(String[] args) {
        System.out.println(maxArea(new int[] {1, 8, 6, 2, 5, 4, 8, 3, 7})); // 49
        System.out.println(maxArea(new int[] {0, 1, 0})); // 0
        System.out.println(maxArea(new int[] {1, 1})); // 1
    }

    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;
        while (left < right) {
            int distance = right - left;
            if (height[left] >= height[right]) {
                maxArea = Math.max(maxArea, height[right] * distance);
                right--;
            } else {
                maxArea = Math.max(maxArea, height[left] * distance);
                left++;
            }
        }
        return maxArea;
    }
}
