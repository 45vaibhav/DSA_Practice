import java.util.*;
public class FindFirstOcurance {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int index=0;
        System.out.println("Enter the arrray element : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the target to find occurance : ");
        int target=sc.nextInt();
        int ans=fun(arr,index,n, target);
        System.out.println("the first occurane is : "+ans);
    }

    static int fun(int [ ]arr, int index , int n , int target ){
                    if(n==index){
                        return -1;
                    }

                    if(target==arr[index]){
                        return index ;
                    }

                    return fun(arr, index+1,n,target);
    }
}


/*
Enter the size of array : 
5
Enter the arrray element : 
5 2 3 2 4
enter the target to find occurance : 
2
the first occurane is : 1


Enter the size of array : 
5
Enter the arrray element : 
2 3 3 4 4 
enter the target to find occurance : 
4
the first occurane is : 3
*/
