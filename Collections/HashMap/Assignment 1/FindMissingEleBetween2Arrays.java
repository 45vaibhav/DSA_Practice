import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindMissingEleBetween2Arrays {
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
        
        for(int i=0;i<arr1.length;i++){
            hm.put(arr1[i], hm.getOrDefault(arr1[i], 0)+1);
        }

      
        for(Map.Entry<Integer,Integer>entry:hm.entrySet()){
            if(entry.getValue()==1){
                System.out.println("the missing element in another array is : "+entry.getKey());
            }
        }
    }
}

/*
enter the 1st array size : 
7
enter the 1st array Element : 
1 1 2 2 2 3 7
enter the  2nd array size : 
6
enter the array Element : 
1 1 2 2 2 3
the missing element in another array is : 7



enter the 1st array size : 
4
enter the 1st array Element : 
1 2 3 4
enter the  2nd array size : 
3
enter the array Element : 
2 3 4
the missing element in another array is : 1
*/
