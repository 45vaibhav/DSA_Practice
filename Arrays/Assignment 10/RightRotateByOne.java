import java.util.Arrays;
import java.util.Scanner;

public class RightRotateByOne {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array Element : ");
        
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
int temp=arr[arr.length-1];
        for(int i=arr.length-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=temp;
        System.out.println(Arrays.toString(arr));
    }
}



/*
enter the size of array : 
5
Enter the array Element : 
1 2 3 4 5
[5, 1, 2, 3, 4]
*/
