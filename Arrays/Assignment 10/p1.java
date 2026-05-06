import java.util.Scanner;

public class p1 {
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array Element : ");

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }


    }
}
