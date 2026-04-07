import java.util.Arrays;
import java.util.Scanner;

public class RepalcEleWithFreq {
          public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of 1st array : ");
        int n=sc.nextInt();
       

        int arr[]=new int[n];
        System.out.println("enter array elements : ");
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
    
        for(int i=0;i<Math.max(arr.length,arr.length);i++){
          freq[arr[i]]++;
           
        }
        int index=0;
        int index2=0;
      int fre1_arr[]=new int[freq.length];
       int fre2_arr[]=new int[freq.length];
        for(int i=0;i<freq.length;i++){
          
        }

        
    }
}
