import java.util.Scanner;

public class CountEvenAndOddNum {
      public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array Element : ");

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int oddCount=0;
       
        for(int i=0;i<arr.length;i++){
          if(arr[i]%2!=0){
            oddCount++;
          }
        }
        System.out.println("odd Element count is element :"+oddCount);
        System.out.println("even Element count is element :"+(n-oddCount));
    }
}

/*
enter the size of array : 
5
Enter the array Element : 
1 2 3 4 5
odd Element count is element :3
even Element count is element :2
*/
