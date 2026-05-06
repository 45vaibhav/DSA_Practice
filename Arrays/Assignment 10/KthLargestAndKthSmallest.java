import java.util.Arrays;
import java.util.Scanner;

public class KthLargestAndKthSmallest {
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array Element : ");

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        int minIndex=0;

        for(int i=0;i<arr.length;i++){
            minIndex=i;
            for(int j=0;j<arr.length;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }

                int temp=arr[i];
                arr[i]=arr[minIndex];
                arr[minIndex]=temp;
            }
        }
System.out.println(Arrays.toString(arr));
      int k=2;

      System.out.println("kth smallest : "+(arr[k-1]));
      System.out.println("kth largest :"+(arr[n-k]));

    }
}

/*
enter the size of array : 
6
Enter the array Element : 
3 2 1 5 6 4
[6, 5, 4, 3, 2, 1]
kth smallest : 5
kth largest :2


enter the size of array : 
6
Enter the array Element : 
23 4 55 6 7 9 5
[55, 23, 9, 7, 6, 4]
kth smallest : 23
kth largest :6
*/
