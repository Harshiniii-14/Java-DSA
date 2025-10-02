import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        n = sc.nextInt();
        System.out.println("Enter array elements for selection sort: ");
        int arr[] = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        //Bubble Sort Algorithm
        for(int i=n-1; i>0; i--) {
            for(int j=0; j<i; j++) {
                if(arr[j] > arr[j+1]) {
                    //Swap elements
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("Sorted Array Elements:");
        for(int i=0; i<n; i++) {
            System.out.print(arr[i]+" ");
        }
        
        sc.close();
    }
}
