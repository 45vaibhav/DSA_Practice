import java.util.*;

public class CheckAllElementUnique {
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
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[i]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        boolean ans=fun(arr,index,n);
        System.out.println("the Array elements are unique : "+ans);
    }

    static boolean fun(int [ ]arr, int index , int n ){
                   boolean val;

                    if(arr[index]!=arr[index+1]){
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
1 2 3 4
the Array sorted : true


Enter the size of array : 
3
Enter the arrray element : 
23 43 11
the Array sorted : true
*/
