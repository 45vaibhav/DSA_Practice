import java.util.Scanner;

public class AvgOfArray {
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
        double avg=sum/n;
        System.out.println("the avg is : "+avg);

    }
}

/*
enter the size of array : 
3
Enter the array Element : 
10 20 30
Reverse Array is : 
the avg is : 20.0


enter the size of array : 
4
Enter the array Element : 
11 2 3 44
Reverse Array is : 
the avg is : 15.0
*/
