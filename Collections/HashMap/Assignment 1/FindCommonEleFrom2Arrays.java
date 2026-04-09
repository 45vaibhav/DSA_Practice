import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindCommonEleFrom2Arrays {
     public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the 1st array size : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the 1st array Element : ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the  2nd array size : ");
        int m=sc.nextInt();
        int arr1[]=new int[m];
        System.out.println("enter the array Element : ");
        for(int i=0;i<arr1.length;i++){
            arr1[i]=sc.nextInt();
        }

        HashMap <Integer , Integer >hm=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            hm.put(arr[i], hm.getOrDefault(arr[i], 0)+1);
        }
        
        
        int index=0;
      int ans[]=new int[Math.max(arr.length,arr1.length)];
    //    HashMap<Integer,Integer>hm2=new HashMap<>();4
    
       for(int i=0;i<arr1.length;i++){
        if(hm.containsKey(arr1[i])&& hm.get(arr1[i])>0){
            ans[index]=arr1[i];
            index++;
            hm.put(arr1[i], hm.get(arr1[i]) - 1);
        }
       }

        System.out.println("output : "+Arrays.toString(ans));
    }
}

/*
enter the 1st array size : 
4
enter the 1st array Element : 
1 2 2 3
enter the  2nd array size : 
3
enter the array Element : 
2 2 4
output : [2, 2, 0, 0]
*/
