import java.util.Scanner;

public class SortedArraycheck {
    
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
        System.out.println("the Array sorted : "+ans);
    }

    static boolean fun(int [ ]arr, int index , int n ,  boolean val){
                    if(n-1==index){
                        return val;
                    }

                    if(arr[index]<arr[index+1]){
                       val=true;
                    }else{
                        val=false;
                        return val;
                    }

                    return fun(arr, index+1,n,val);
    }
}

/*
Enter the size of array : 
5
Enter the arrray element : 
1 2 3 4 5
the Array sorted : true

Enter the size of array : 
5
Enter the arrray element : 
3 2 4 5 7
the Array sorted : false
*/
