import java.util.Scanner;

public class FIndMissingElementsFrom2Arrays {
      public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of  first array : ");
        int n=sc.nextInt();

        int arr[]=new int[n];
        System.out.println("enter the array elements : ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
         System.out.println("enter the size of  second array : ");
        int m=sc.nextInt();

        int arr2[]=new int[m];
        System.out.println("enter the array elements : ");
        for(int i=0;i<arr2.length;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<arr.length;i++){
             int count=0;
            for(int j=0;j<arr2.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count==0){
                System.out.println("the missing element : "+arr[i]);
            }
        }
}
}

/*
enter the size of  first array : 
7
enter the array elements : 
1 1 2 2 2 3 7
enter the size of  second array : 
6
enter the array elements : 
1 1 2 2 2 3
the missing element : 7



enter the size of  first array : 
5
enter the array elements : 
1 4 4 3 2 
enter the size of  second array : 
4
enter the array elements : 
1 3 4 4
the missing element : 2
*/
