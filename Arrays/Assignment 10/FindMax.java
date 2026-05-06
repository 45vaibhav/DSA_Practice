import java.util.Scanner;

public class FindMax {
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
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }

        System.out.println("Max is : "+max);

    }
}

/*
enter the size of array : 
4
Enter the array Element : 
1 2 9 5
Max is : 9
*/
