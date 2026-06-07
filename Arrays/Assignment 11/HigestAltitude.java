import java.util.Arrays;
import java.util.Scanner;

public class HigestAltitude {
      public static void main(String args[]){
           Scanner sc=new Scanner (System.in);
        System.out.println("enter the size of Array : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the array element : ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        int new_arr[]=new int[n+1];
        int index=1;
        int sub=0;
        new_arr[0]=0;
        for(int i=0;i<arr.length-1;i++){
            sub=arr[i]+sub;
             new_arr[index]=sub;
             index++;
             
            
        }
        System.out.println(Arrays.toString(new_arr));
        int max=0;
        for(int i=0;i<new_arr.length;i++){
            if(new_arr[i]>max){
                max=new_arr[i];
            }
        }
        System.out.println("Max altitude : "+max);
      }
}

/*
enter the size of Array : 
5
enter the array element : 
-5 1 5 0 -7
[0, -5, -4, 1, 1, 0]
Max altitude : 1
*/
