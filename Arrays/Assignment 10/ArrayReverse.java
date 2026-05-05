import java.util.Scanner;

public class ArrayReverse {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array Element : ");

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Reverse Array is : ");
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }

    }
}

/*
enter the size of array : 
5
Enter the array Element : 
1 2 3 4 5
Reverse Array is : 
5 4 3 2 1 



enter the size of array : 
4
Enter the array Element : 
5
3
2
8
Reverse Array is : 
8 2 3 5 
*/
