import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the size of array : ");
        int n=sc.nextInt();
        System.out.println("enter the array element :");
        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<n-1;i++){
            boolean swap=false;
         

            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap=true;
                }
            }
            if(!swap){
                break;
            }
        }

        System.out.println("the sorted array is "+Arrays.toString(arr));
    }
}


/*
enter the size of array : 
5
enter the array element :
30 25 27 35 29
the sorted array is [25, 27, 29, 30, 35]

enter the size of array : 
5
enter the array element :
15 10 25 40 30
the sorted array is [10, 15, 25, 30, 40]
*/
