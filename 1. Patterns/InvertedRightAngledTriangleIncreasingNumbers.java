package Patterns;
public class Pattern6 {
    public static void main(String[] args) {
        for(int i=5; i>0; i--) {
            int k=1;
            for(int j=0; j<i; j++) {
                System.out.print(k++);
            }
            System.out.println();
        }
    }
}
