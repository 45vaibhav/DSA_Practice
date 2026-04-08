import java.util.Scanner;

public class CheckArrayStrictlyDecreasing {
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
        
        boolean ans=fun(arr,index,n);
        System.out.println("the Array strictly decreasing : "+ans);
    }

    static boolean fun(int [ ]arr, int index , int n ){
                   
                    boolean val;
                    if(arr[index]!=arr[index+1] && arr[index]>arr[index+1]){
                       val=true;
                    }else{
                        val=false;
                        return val;
                    }
                     if(n-2==index){
                        return val;
                    }

                    return fun(arr, index+1,n);
    }
}

/*
Enter the size of array : 
4
Enter the arrray element : 
9 7 5 2
the Array strictly increasing : true


Enter the size of array : 
5
Enter the arrray element : 
5 6 3 2 1
the Array strictly increasing : false
*/
