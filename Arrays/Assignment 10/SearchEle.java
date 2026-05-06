import java.util.Scanner;

public class SearchEle {
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array Element : ");

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

       int x=20;

       for(int i=0;i<arr.length;i++){
        if(arr[i]==x){
            System.out.println("index is : "+i);
        }
       }

    }
}
/*
enter the size of array : 
4
Enter the array Element : 
10 20 30 40
index is : 1
*/