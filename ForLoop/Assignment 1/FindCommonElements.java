import java.util.Arrays;
import java.util.Scanner;

public class FindCommonElements {
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
            arr2[i]=sc.nextInt();
        }
        int ans[]=new int[(Math.max(arr.length, arr2.length))];
        int index=0;
        for(int i=0;i<arr.length;i++){
             int count=0;
            for(int j=0;j<arr2.length;j++){
                if(arr[i]==arr2[j]){
                    count++;
                }
            }
            if(count>=1){
               ans[index]= arr[i];
               index++;
            //    ans[index]=count;
            //    index++;
            }
        }
        System.out.println(Arrays.toString(ans));
}
}

/*
enter the size of  first array : 
4
enter the array elements : 
1 2 2 3
enter the size of  second array : 
3  
enter the array elements : 
2 2 4
[2, 2, 0, 0]



enter the size of  first array : 
4
enter the array elements : 
1 2 3 4
enter the size of  second array : 
4
enter the array elements : 
1 2 3 4
[1, 2, 3, 4]
*/
