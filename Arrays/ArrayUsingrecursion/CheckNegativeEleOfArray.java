import java.util.Scanner;

public class CheckNegativeEleOfArray {
       public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
       int index=0;
       boolean val=false;
        System.out.println("Enter the arrray element : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        boolean ans=fun(arr,index,n,val);
        System.out.println("the Array contain negative element  : "+ans);
    }

    static boolean fun(int [ ]arr, int index , int n ,  boolean val){
                    if(n-1==index){
                        return val;
                    }

                    if(arr[index]<0){
                       val=true;
                       return val;
                    }else{
                        val=false;
                       
                    }

                    return fun(arr, index+1,n,val);
    }
}


/*
Enter the size of array :
4
Enter the arrray element : 
1 2 -3 4
the Array contain negative element  : true


Enter the size of array : 
4
Enter the arrray element : 
1 4 3 1
the Array contain negative element  : false
*/
