import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RemoveDuplicateFromArray {
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
            int ans[]=new int[arr.length+1];
            int index=0;
        for(Map.Entry<Integer , Integer >entry:hm.entrySet()){
            if(entry.getValue()==1){
               ans[index]=entry.getKey();
               index++;
            }
        }

        System.out.println(Arrays.toString(ans));
        
    }
}

/*
enter the array size : 
5
enter the array Element : 
1 2 2 2 3
[1, 3, 0, 0, 0, 0]


enter the array size : 
5
enter the array Element : 
7 7 5 43 2
[2, 5, 43, 0, 0, 0]
*/
