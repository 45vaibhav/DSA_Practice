import java.util.Scanner;

public class CheckAllArrayEvenOrNot {
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
        System.out.println("the Array Even : "+ans);
    }

    static boolean fun(int [ ]arr, int index , int n ){
                    boolean val;
                    if(arr[index]%2==0){
                       val=true;
                    }else{
                        return false;
                    }
                     if(n-1==index){
                        return val;
                    }

                    return fun(arr, index+1,n );
    }
}

/*
Ente
enter the size of array :
3
Enter the arrray element :
2  4 6
the Array even : true

Enter the size of array : 
4
Enter the arrray element : 
2 3 6 8
the Array even  : false
*/
