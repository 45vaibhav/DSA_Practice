public class PrintArrayUsingrecursion {
    public static void main(String args[]){
        int arr[]={2,4,6,7,0};
        int n=arr.length-1;
            fun(arr,n);
    }

   static void fun(int []arr,int n){
        if(n==0){
            System.out.println(arr[n]);
            return ;
        }

        fun(arr,n-1);
        System.out.println(arr[n]);
    }
}

/*
2
4
6
7
0
*/
