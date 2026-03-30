import java.util.Scanner;

public class CheckArrayContainsX {
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
        boolean val=false;
        System.out.println("enter the target  : ");
        int target=sc.nextInt();
        boolean ans=fun(arr,index,n, target,val);
        System.out.println("the array contaions target  : "+ans);
    }

    static boolean fun(int [ ]arr, int index , int n , int target ,  boolean val){
                    if(n==index){
                        return val;
                    }

                    if(target==arr[index]){
                        val=true ;
                        
                    }

                    return fun(arr, index+1,n,target,val);
    }
}

/*
Enter the size of array : 
4
Enter the arrray element : 
1 2 3 4 
enter the target  : 
3
the array contaions target  : true
*/
