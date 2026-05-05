import java.util.Scanner;

public class SumOfArray {
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array Element : ");

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        System.out.println("Reverse Array is : ");
        for(int i=arr.length-1;i>=0;i--){
            sum+=arr[i];
        }

        System.out.println("the sum is : "+sum);

    }
}


/*
enter the size of array : 
4
Enter the array Element : 
10 20 30 40
Reverse Array is : 
the sum is : 100

enter the size of array : 
3
Enter the array Element : 
20 40 60
Reverse Array is : 
the sum is : 120
*/
