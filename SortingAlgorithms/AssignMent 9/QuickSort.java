import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();

        System.out.println("Enter the array elements:");
        int arr[] = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        f(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }

    public static void f(int arr[], int low, int high){
        if(low >= high){
            return;
        }

        int pivot = pivotFinder(arr, low, high);

        f(arr, low, pivot - 1);
        f(arr, pivot + 1, high);
    }

    public static int pivotFinder(int arr[], int low, int high){
        int pivot = arr[low];
        int i = low;
        int j = high;

        while(i < j){
            while(i <= high && arr[i] <= pivot){
                i++;
            }

            while(j >= low && arr[j] > pivot){
                j--;
            }

            if(i < j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j;
    }
}


/*
Enter the size of array: 
5
Enter the array elements:
75 85 55 95 65
[55, 65, 75, 85, 95]

Enter the size of array: 
5
Enter the array elements:
42 56 12 67 34
[12, 34, 42, 56, 67]
*/
