import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicateFromArray {
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array size : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the array elements : ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
            int freq[]=new int[max+1];

            for(int i=0;i<arr.length;i++){
                freq[arr[i]]++;
            }
            int index=0;
            int new_arr[]=new int[freq.length];
            for(int i=0;i<freq.length;i++){
                if(1==freq[i]){
                  new_arr[index]=i;
                  index++;
                }
            }

            System.out.println(Arrays.toString(new_arr));
    
    }
}

/*
enter the array size : 
5
enter the array elements : 
1 2 2 2 3
[1, 3, 0, 0]



enter the array size : 
5
enter the array elements : 
3 4 5 3 3
[4, 5, 0, 0, 0, 0]
*/
