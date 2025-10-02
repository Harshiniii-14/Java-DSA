import java.util.*;

class SelectionSort {
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

        //Selection Sort Algorithm
        for(int i=0; i<n-1; i++) {
            int min = i;
            for(int j=i; j<n; j++) {
                if(arr[j] < arr[min]) {
                    int temp = arr[j];
                    arr[j] = arr[min];
                    arr[min] = temp;
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