package Patterns;
public class Pattern12 {
    public static void main(String[] args) {
        for(int i=0; i<=3; i++) {
            for(int j=0; j<=i; j++) {
                System.out.print(j+1);
            }
            // 2n - 2i, let n = 3 here for 4 rows
            //i = 0, 6 spaces
            //i = 1, 4 spaces
            //i = 2, 2 spaces
            for(int k=2*3 - 2*i; k>0; k--) {
                System.out.print(" ");
            }

            for(int j=i+1; j>0; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
