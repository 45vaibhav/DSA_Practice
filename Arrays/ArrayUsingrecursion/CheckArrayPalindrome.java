import java.util.Scanner;

public class CheckArrayPalindrome {
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
       int index=0;
       int reverse=n-1;
        System.out.println("Enter the arrray element : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        boolean ans=fun(arr,index,reverse);
        System.out.println("the Array Palindrome : "+ans);
    }

    static boolean fun(int [ ]arr, int index ,int reverse){
                   boolean val;

                    if(arr[index]!=arr[reverse]){
                       return false;
                    }
                     if(reverse==index || reverse==index+1){
                        return true;
                    }

                    return fun(arr, index+1,reverse-1);
    }
}

/*
Enter the size of array : 
5 
Enter the arrray element : 
1 2 3 2 1
the Array Palindrome : true

Enter the size of array : 
4
Enter the arrray element : 
1 2 2 1
the Array Palindrome : true
*/
