import java.util.Arrays;
import java.util.Scanner;

public class ReplaceElementsWithFreq {
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array : ");
        int n=sc.nextInt();

        int arr[]=new int[n];
        System.out.println("enter the array elements : ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
    

        int index=0;
        for(int i=0;i<arr.length;i++){
             int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
           arr[index]=count;
           index++;
        }
        System.out.println(Arrays.toString(arr));
       
    }
}

/*
enter the size of array : 
4
enter the array elements : 
1 2 2 3
[1, 2, 2, 1]



enter the size of array : 
7
enter the array elements : 
1 1 1 2 2 6 8
[3, 2, 1, 3, 2, 1, 1]
*/
