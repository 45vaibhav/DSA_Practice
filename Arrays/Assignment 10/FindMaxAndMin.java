import java.util.Scanner;

public class FindMaxAndMin {
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array Element : ");

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int max=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
          if(arr[i]>max){
            max=arr[i];
          }

          if(arr[i]<min){
            min=arr[i];
          }
        }

        System.out.println("Max element :"+max);
        System.out.println("Min element :"+min);

    }

}

/*
enter the size of array : 
5
Enter the array Element : 
5 8 2 10 3
Max element :10
Min element :2

enter the size of array : 
4
Enter the array Element : 
11 22 3 90
Max element :90
Min element :3
*/
