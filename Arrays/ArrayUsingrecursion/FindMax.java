import java.util.Scanner;

public class FindMax {
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int index=0;
        int max=0;
        System.out.println("Enter the arrray element : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
     
        int ans=fun(arr,index,n, max);
        System.out.println("the Max elemnt in Array is  : "+ans);
    }

    static int fun(int [ ]arr, int index , int n , int max){
                    if(n==index){
                        return max;
                    }

                    if(max < arr[index]){
                       max=arr[index];
                    }

                    return fun(arr, index+1,n,max);
    }
}


/*
Enter the size of array : 
4
Enter the arrray element : 
3 9 1 7
the Max elemnt in Array is  : 9
*/
