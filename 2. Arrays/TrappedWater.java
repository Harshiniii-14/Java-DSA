import java.math.*;

public class TrappedWater {

    public static int trappedRainWater(int height[]) {
        int n = height.length;
        //calculate left max boundaries
        int leftMax[] = new int[height.length];
        leftMax[0] = height[0];
        for(int i=1; i<height.length; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i-1]); 
            //for each bar, the current bar is compared to the max to it's left side max
        }
        //calculate right max boundaries
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1]; // the right most value is it's own max
        for(int i=n-2; i>=0; i--) { //starting from the second from last to check
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
            //current bar compared to it's right max
        }
        int trappedWater = 0;
        //take a loop
        for(int i=0; i<n; i++) {
            //calculate the water levels 
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += waterLevel - height[i]; 
        }
        return trappedWater;
    }
    public static void main(String[] args) {
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println("The trapped rain water is " + trappedRainWater(height));
    }
}
