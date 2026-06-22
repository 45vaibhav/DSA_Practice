import java.util.Arrays;
import java.util.Scanner;

public class InsenrtionSort {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of Array : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the array elements : ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        int minIndex=0;
        for(int i=0;i<arr.length;i++){
            minIndex=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minIndex]>arr[j]){
                    minIndex=j;
                }
                int temp=arr[i];
                arr[i]=arr[minIndex];
                arr[minIndex]=temp;
            }
        }
        System.out.println("Sorted Array is : ");
        System.out.println(Arrays.toString(arr));

    }
}
