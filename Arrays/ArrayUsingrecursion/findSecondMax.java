import java.util.Scanner;

public class findSecondMax {
      public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int index=0;
        int max=0;
        int secondMax=0;
        System.out.println("Enter the arrray element : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
     
        int ans=fun(arr,index,n, max,secondMax);
        System.out.println("the Max elemnt in Array is  : "+ans);
    }

    static int fun(int [ ]arr, int index , int n , int max, int secondMax){
               
                    if(n==index){
                        return secondMax;
                    }

                    if(max < arr[index]){
                   
                       max=arr[index];
                    }
                    if(max>secondMax && secondMax < arr[index] && arr[index]<max){
                        secondMax=arr[index];
                    }

                    return fun(arr, index+1,n,max, secondMax);
    }
}


/*
Enter the arrray element : 
10 5 8 20 15
the Max elemnt in Array is  : 15
*/
