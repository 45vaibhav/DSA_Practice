import java.util.Arrays;
import java.util.Scanner;

public class PrintEleAtEvenAndOddIndices {
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array Element : ");

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int oddIndices[]=new int[n/2+1];
        int evenIndices[]=new int[n/2+1];
       int index=0;
       int index2=0;
        for(int i=0;i<arr.length;i++){
          if(i%2!=0){
           oddIndices[index]=arr[i];
           index++;
          }else{
            evenIndices[index2]=arr[i];
            index2++;
          }

        }

        System.out.println("Odd indices element : "+Arrays.toString(oddIndices));
        System.out.println("Even Indices element : "+Arrays.toString(evenIndices));
        
    }
}

/*
enter the size of array : 
5
Enter the array Element : 
10 20 30 40 50
Odd indices element : [20, 40, 0]
Even Indices element : [10, 30, 50]

enter the size of array : 
3
Enter the array Element : 
11 33 4
Odd indices element : [33, 0]
Even Indices element : [11, 4]
*/
