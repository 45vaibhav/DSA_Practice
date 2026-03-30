import java.util.Scanner;

public class SumOFAllNegativeElements {
         public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int index=0;
        int sum=0;
        System.out.println("Enter the arrray element : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
  
      
        int ans=fun(arr,index,n, sum);
        System.out.println("the array negative element sum is   : "+ans);
    }

    static int fun(int [ ]arr, int index , int n , int sum){
                    if(n==index){
                        return sum;
                    }

                    if(0>arr[index]){
                        sum+=arr[index];
                        
                    }

                    return fun(arr, index+1,n,sum);
    }
}

/*
Enter the size of array : 
5
Enter the arrray element : 
1 -2 3 -4 5
the array negative element sum is   : -6
*/
