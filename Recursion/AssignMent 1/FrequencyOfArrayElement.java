import java.util.*;
public class FrequencyOfArrayElement {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter array element : ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter target :");
        int target=sc.nextInt();
        int index=0;
        int count=0;
        int ans=fun(arr,target,index,n,count);
        System.out.println("the frequency is :"+ans);
    }

    static int fun(int []arr,int target,int index,int n, int count){
        if(n==index){
            return count  ;
        }

        if(arr[index]==target){
            count++;
        }

        return fun(arr, target, index+1, n, count);
    }
}


/*
enter the size of array : 
5
enter array element : 
3 4 3 6 1
enter target :
3
the frequency is :2
*/
