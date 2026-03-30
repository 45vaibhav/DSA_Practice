import java.util.Scanner;

public class FindMin {
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
      int min=arr[0];
        int ans=fun(arr,index,n, min);
        System.out.println("the Min elemnt in Array is  : "+ans);
    }

    static int fun(int [ ]arr, int index , int n , int min){
                    if(n==index){
                        return min;
                    }

                    if(min > arr[index]){
                       min=arr[index];
                    }

                    return fun(arr, index+1,n,min);
    }
}

/*
Enter the size of array : 
5
Enter the arrray element : 
3 9 1 7 4
the Min elemnt in Array is  : 1
*/
