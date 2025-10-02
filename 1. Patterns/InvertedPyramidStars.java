package Patterns;
public class Pattern7 {
    public static void main(String[] args) {
        for(int i=0; i<5; i++) {
            for(int j=0; j<i; j++) {
                System.out.print(" ");
            } //9, 7, 5, 3, 1 - 
            for(int k=0; k<2*5-(2*i+1); k++)  { //we are always trying to relate k wrt outer loop i, here if i = 0, then 2*5 = 10 - 2*i+1 = 10 - 1 = 9
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}
