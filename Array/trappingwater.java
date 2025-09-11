public class trappingwater {
    

public static int trap(int[] height) {
        int n = height.length;

        // Step 1: Create leftMax array
        // leftMax[i] = tallest bar from start (0) to i
        int leftMax[] = new int[n];
        leftMax[0] = height[0]; // first element itself
        for(int i = 1; i < n; i++){
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        // Step 2: Create rightMax array
        // rightMax[i] = tallest bar from i to end (n-1)
        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1]; // last element itself
        for(int i = n - 2; i >= 0; i--){
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        // Step 3: Calculate trapped water
        int trapWater = 0;
        for(int i = 0; i < n; i++){
            // Water level at index i = min of tallest bars from left & right
            int waterLevel = Math.min(leftMax[i], rightMax[i]);

            // Water trapped at i = waterLevel - height[i]
            trapWater += waterLevel - height[i];
        }

        return trapWater; // total trapped water
    }


public static void main(String[] args) {
    int[] height = {4,2,0,6,3,2,5};
    System.out.println(trap(height));
}





}
