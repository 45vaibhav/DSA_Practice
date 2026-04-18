import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the array element : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int minIndex=0;

        for(int i=0;i<n-1;i++){
            minIndex=i;

            for(int j=i+1;j<n;j++){
                if(arr[minIndex]>arr[j]){
                    minIndex=j;
                }
            }

            int temp=arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;
        }
        System.out.println("sorted array is ");
        System.out.println(Arrays.toString(arr));
    }
}

/*
enter the size of array : 
5
enter the array element : 
18 22 20 21 19
sorted array is 
[18, 19, 20, 21, 22]



enter the size of array : 
5
enter the array element : 
34 12 56 45 23
sorted array is 
[12, 23, 34, 45, 56]
*/
