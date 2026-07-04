import java.util.ArrayList;
import java.util.Scanner;

public class MaxSubArraySum2 {
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Arrray : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array elements : ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        ArrayList<Integer>ls=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            ls.add(sum);
            if(sum<0){
                sum=0;
            }

        }
        int max=0;
        for(int i=0;i<ls.size();i++){
            if(ls.get(i)>max){
                max=ls.get(i);
            }
        }

        System.out.println("max subArray sum is : "+max);
    }
}

/*
Enter the size of Arrray : 
9
Enter the array elements : 
-2 1 -3 4 -1 2 1 -5 4
max subArray sum is : 6
*/
