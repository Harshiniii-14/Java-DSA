package Patterns;
public class Pattern11 {
    public static void main(String[] args) {
        int num=1;
        for(int i=0; i<5; i++) {
            for(int j=0; j<=i; j++) {
                System.out.print(num+" ");
                if(num==1) {
                    num = 0;
                } else {
                    num=1;
                }
            }
            System.out.println();
        }
    }
}
