import java.util.Scanner;

public class IndexOfMinElement {
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int index=0;
       int smallIndex=0;
        System.out.println("Enter the arrray element : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
      int min=arr[0];
        int ans=fun(arr,index,n, min,smallIndex);
        System.out.println("the Min elemnt in Array index  is  : "+ans);
    }

    static int fun(int [ ]arr, int index , int n , int min,int smallIndex){
                    if(n==index){
                        return smallIndex;
                    }

                    if(min > arr[index]){
                       min=arr[index];
                       smallIndex=index;
                    }

                    return fun(arr, index+1,n,min,smallIndex);
    }
}

/*
Enter the size of array : 
5
Enter the arrray element : 
5 2 6 1 3
the Min elemnt in Array index  is  : 3
*/
