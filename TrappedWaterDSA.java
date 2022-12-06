package Arrays;

public class TrappedWaterDSA {
    //Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.
    public static int trappedRainWater(int height[]) {
        int n = height.length;

        // Calculate left max boundary-array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        // Calculate right max boundary-array
        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i > 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        int trapperWater = 0;
        // loop
        for (int i = 0; i < n; i++) {
            // Waterlevel = min(leftmax bound, rightmax bound)
            int waterlevel = Math.min(leftMax[i], rightMax[i]);

            // Trapped Water = waterlevel - height[i]
            trapperWater += waterlevel - height[i];
        }

        return trapperWater;
    }

    public static void main(String[] args) {
        int height[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        System.out.println(trappedRainWater(height));
    }
}
