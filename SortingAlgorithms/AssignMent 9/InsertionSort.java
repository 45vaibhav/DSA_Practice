import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String arsg[]){
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the size of array : ");
        int n=sc.nextInt();
        System.out.println("enter the array element :");
        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        } 

        for(int i=1;i<n;i++){
            int currentElement=arr[i];
            int left=i-1;

            while(left>=0 && arr[left]>currentElement){
                    arr[left+1]=arr[left];
                    left--;
            }

            arr[left+1]=currentElement;
        }

        System.out.println("the sorted Array : "+Arrays.toString(arr));
    }
}

/*
enter the size of array : 
5
enter the array element :
18 22 20 19 21 
the sorted Array : [18, 19, 20, 21, 22]

enter the size of array : 
5
enter the array element :
34 12 56 45 23
the sorted Array : [12, 23, 34, 45, 56]
*/
