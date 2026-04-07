import java.util.Arrays;
import java.util.Scanner;

public class GroupNumbersByFreq {
    
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
            if(freq[i]==1){
                fre1_arr[index]=i;
                index++;
            }
            if(freq[i]==2){
                fre2_arr[index2]=i;
                index2++;
            }
        }

        System.out.println("freq 1 array elements "+Arrays.toString(fre1_arr));
         System.out.println("freq 1 array elements "+Arrays.toString(fre2_arr));
    }
}


/*
enter the size of 1st array : 
6
enter array elements : 
1 1 2 2 3 5
freq 1 array elements [3, 5, 0, 0, 0, 0]
freq 1 array elements [1, 2, 0, 0, 0, 0]
*/
