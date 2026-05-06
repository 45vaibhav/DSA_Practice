import java.util.Scanner;

public class CheckArraySorted {
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array Element : ");

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int index=0;
        boolean ans=fun(arr,index);
        System.out.println(ans);

    }

    public static boolean fun(int arr[],int index){

        if(index==arr.length-1){
            return true;
        }

        if(arr[index]>=arr[index+1]){
            return false;
        }

        return  fun(arr,index+1);

    }
}

/*
enter the size of array : 
4
Enter the array Element : 
1 2 3 4
true


enter the size of array : 
5
Enter the array Element : 
5 3 1 2 4 7
false
*/
