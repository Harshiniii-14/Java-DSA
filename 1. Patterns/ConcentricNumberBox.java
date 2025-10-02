package Patterns;
import java.lang.Math;

public class Pattern22 {
    public static void main(String[] args) {
        int n = 4;
        for(int i=0; i<2*n-1; i++) {
            for(int j=0; j<2*n-1; j++) {
                int top = i;
                int left = j;
                int right = (2*n - 1) - 1 - j; //(6 - j)
                int bottom = (2*n - 2) - i;
                int minDistance = Math.min(Math.min(top, left), Math.min(right, bottom));
                System.out.print(n - minDistance);
            }
            System.out.println();
        }
    }
}
