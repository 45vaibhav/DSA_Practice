import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ReplaceEleWithFreq {
      public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the array size : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the array Element : ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        HashMap <Integer , Integer >hm=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            hm.put(arr[i], hm.getOrDefault(arr[i], 0)+1);
        }

        int freq1[]=new int[arr.length];
        
        int index=0;
        
       for(int i=0;i<arr.length;i++){
        if(hm.containsKey(arr[i])&& hm.get(arr[i])>0){
            freq1[index]=hm.get(arr[i]);
            index++;
        }
       }

        System.out.println(" array "+Arrays.toString(freq1));
        
    }
}

/*
enter the array size : 
4
enter the array Element : 
1 2 2 3
 array [1, 2, 2, 1]


 enter the array size : 
5
enter the array Element : 
1 2 2 2 3 
 array [1, 3, 3, 3, 1]
*/
