import java.util.Arrays;
import java.util.Scanner;

public class CopyArrayInAnotherArray {
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array Element : ");

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        int new_arr[]=new int[n];

        for(int i=0;i<arr.length;i++){
            new_arr[i]=arr[i];
        }

        System.out.println("new array : "+Arrays.toString(new_arr));

    }
}

/*
enter the size of array : 
4
Enter the array Element : 
1 5 9 13
new array : [1, 5, 9, 13]
*/ 
