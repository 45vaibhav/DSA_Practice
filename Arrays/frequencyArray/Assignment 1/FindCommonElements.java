import java.util.Arrays;
import java.util.Scanner;

public class FindCommonElements {
        public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of 1st array : ");
        int n=sc.nextInt();
       

        int arr1[]=new int[n];
        System.out.println("enter array elements : ");
        for(int i=0;i<arr1.length;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("enter the size of 2nd array : ");
        int m=sc.nextInt();
        int arr2[]=new int[m];
         System.out.println("enter array elements : ");
        for(int i=0;i<arr2.length;i++){
            arr2[i]=sc.nextInt();
        }
        int max=arr1[0];
        for(int i=0;i<arr1.length;i++){
            if(max<arr1[i]){
                max=arr1[i];
            }
        }
             int max2=arr2[0];
        for(int i=0;i<arr2.length;i++){
            if(max2<arr2[i]){
                max2=arr2[i];
            }
        }
        int freq[]=new int[Math.max(max,max2)+1];
    
        for(int i=0;i<Math.max(arr1.length,arr2.length);i++){
          freq[arr1[i]]++;
           
        }
        int index=0;
        int ans[]=new int[freq.length];
        for(int i=0;i<arr2.length;i++){
            if(freq[arr2[i]]>0){
               ans[index]=arr2[i];
               index++;
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}

/*
enter the size of 1st array : 
4
enter array elements : 
1 2 2 3
enter the size of 2nd array : 
3
enter array elements : 
2 2 4
[2, 2, 0, 0, 0]
*/
