import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ExactlyKEle {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the array size : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the array Element : ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the K : ");
        int k=sc.nextInt();

        HashMap <Integer , Integer >hm=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            hm.put(arr[i], hm.getOrDefault(arr[i], 0)+1);
        }

        for(Map.Entry<Integer , Integer >entry:hm.entrySet()){
            if(entry.getValue()==k){
               System.out.println("the value equal to k is : "+entry.getKey());
            }
        }
        
    }
}


/*
enter the array size : 
6
enter the array Element : 
1 2 2 2 3 3
enter the K : 
2
the value equal to k is : 3
*/
