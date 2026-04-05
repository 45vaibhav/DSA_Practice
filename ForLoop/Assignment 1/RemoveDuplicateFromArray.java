import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicateFromArray {
    public static void main(String args[]){
          Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array : ");
        int n=sc.nextInt();

        int arr[]=new int[n];
        System.out.println("enter the array elements : ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int new_arr[]=new int[arr.length];
      
        int [] ans=fun(arr,new_arr);
        System.out.println(Arrays.toString(ans));  
    }
   public static int [] fun(int []arr,int []new_arr){
    
            int index=0;
            for(int i=0;i<arr.length;i++){
                int count=0;
                for(int j=0;j<arr.length;j++){
                    if(arr[i]==arr[j]){
                        count++;
                    }
                }
                if(count==1){
                    new_arr[index]=arr[i];
                    index++;
                  
                }
            }
            return new_arr;
        }
}

/*
enter the size of array : 
5
enter the array elements : 
1 2 2 2 3
[1, 3, 0, 0, 0] 

*/
