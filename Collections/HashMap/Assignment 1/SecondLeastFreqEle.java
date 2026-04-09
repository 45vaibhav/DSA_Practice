import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SecondLeastFreqEle {
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

        int min=arr.length;
        int secondMinFreq=0;
        int minFreq=0;

        for(Map.Entry<Integer , Integer >entry:hm.entrySet()){
            if(entry.getValue()<min){
                secondMinFreq=minFreq;
                min=entry.getValue();
                minFreq=entry.getKey();
            }
            
        }
        System.out.println("output : "+secondMinFreq);
    }
}

/*
enter the array size : 
6
enter the array Element : 
1 1 2 2 2 3
output : 1
*/
