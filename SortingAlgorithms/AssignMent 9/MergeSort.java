import java.util.Arrays;
import java.util.Scanner;



public class MergeSort {
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the size of array : ");
        int n=sc.nextInt();
        System.out.println("enter the array element :");
        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int low=0;
        int high=arr.length-1;
        f(arr,low ,high);
    }

    public static void f(int arr[],int low , int high){
        if(low>=high){
            return ;
        }

        int mid=(low+high)/2;

        f(arr,low,mid);
        f(arr,mid+1,high);
        merge(arr,low , mid,high);
    }

    public static void merge(int arr[],int low , int mid , int high){
        int merge[]=new int[high-low+1];

        int blue=low;
        int green=mid+1;
        int red=0;
        while(blue<=mid && green<=high){
            if(arr[blue]<=arr[green]){
                merge[red]=arr[blue];
                red++;
                blue++;
            }else{
                merge[red]=arr[green];
                red++;
                green++;

            }
        }
        while(blue<=mid){
            merge[red]=arr[blue];
            red++;
            blue++;
        }

        while(green<=high){
            merge[red]=arr[green];
            red++;
            green++;
        }
        for(int i=0;i<merge.length;i++){
            arr[low+i]=merge[i];
        }
        System.out.println(Arrays.toString(arr));
       
    }
    
}

/*
6
enter the array element :
50 23 9 18 61 32

[9, 18, 23, 32, 50, 61]
*/
