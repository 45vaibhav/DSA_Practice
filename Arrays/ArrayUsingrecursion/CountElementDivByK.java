import java.util.Scanner;

public class CountElementDivByK {
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
        System.out.println("enter the k : ");
        int k=sc.nextInt();
        int ans=fun(arr,index,n, k,count);
        System.out.println("the count of elements divisible by k is : "+ans);
    }

    static int fun(int [ ]arr, int index , int n , int k , int count){
                    if(n==index){
                        return count;
                    }

                    if(arr[index]%k==0){
                        count++ ;
                    }

                    return fun(arr, index+1,n,k,count);
    }
}

/*
Enter the size of array : 
5
Enter the arrray element : 
2 4 5 6 9
enter the k : 
2
the count of elements divisible by k is : 3
*/
