import java.util.Arrays;
import java.util.Scanner;

public class LeftRotateByOne {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array Element : ");
        
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
int temp=arr[0];
        for(int i=0;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=temp;
        System.out.println(Arrays.toString(arr));
    }
}

/*
enter the size of array : 
5
Enter the array Element : 
1 2 3 4 5
[2, 3, 4, 5, 1]
*/
