import java.util.Arrays;
import java.util.Scanner;

public class ArrayInPlace {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array Element : ");

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
            int i=0;
            int j=arr.length-1;

            while(i!=j+1){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
            System.out.println(Arrays.toString(arr));

    }
}

/*
enter the size of array : 
4
Enter the array Element : 
1 2 3 4
[4, 3, 2, 1]
*/
