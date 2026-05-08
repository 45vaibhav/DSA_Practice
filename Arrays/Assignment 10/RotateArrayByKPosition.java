import java.util.Arrays;
import java.util.Scanner;

public class RotateArrayByKPosition {
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array Element : ");

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("enter k : ");
        int k=sc.nextInt();
        int ans[]=new int[n];
        for(int i=0;i<arr.length;i++){
            ans[((i+k)%n)]=arr[i];
        }
        System.out.println(Arrays.toString(ans));
    }
}

/*
enter the size of array : 
5
Enter the array Element : 
1 2 3 4 5
enter k : 
3
[3, 4, 5, 1, 2]


enter the size of array : 
4
Enter the array Element : 
11 4 55 2
enter k : 
2
[55, 2, 11, 4]
*/
