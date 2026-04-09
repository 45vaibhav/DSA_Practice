import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GroupNumByFreq {
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
        int freq2[]=new int[arr.length];
        int index=0;
        int index2=0;
        for(Map.Entry<Integer,Integer>entry:hm.entrySet()){
            if(entry.getValue()==1){
                freq1[index]=entry.getKey();
                index++;
            }
            if(entry.getValue()==2){
                freq2[index2]=entry.getKey();
                index2++;
            }
        }

        System.out.println("freq 1 array "+Arrays.toString(freq1));
        System.out.println("freq 2 array "+Arrays.toString(freq2));
    }
}

/*
enter the array size : 
6
enter the array Element : 
1 1 2 2 3 5
freq 1 array [3, 5, 0, 0, 0, 0]
freq 2 array [1, 2, 0, 0, 0, 0];
*/
