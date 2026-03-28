import java.util.Scanner;

public class CountOfOccurance {
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int index=0;
        int count=0;
        System.out.println("Enter the arrray element : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the target to find occurance : ");
        int target=sc.nextInt();
        int ans=fun(arr,index,n, target,count);
        System.out.println("the first occurane is : "+ans);
    }

    static int fun(int [ ]arr, int index , int n , int target , int count){
                    if(n==index){
                        return count;
                    }

                    if(target==arr[index]){
                       count++;
                    }

                    return fun(arr, index+1,n,target,count);
    }
}


/*
Enter the size of array : 
5
Enter the arrray element : 
1 2 2 3 2
enter the target to find occurance : 
2
the first occurane is : 3


Enter the size of array : 
6
Enter the arrray element : 
1 1 4 6 1 1 
enter the target to find occurance : 
1
the first occurane is : 4
*/
