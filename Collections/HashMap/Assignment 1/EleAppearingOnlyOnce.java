import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EleAppearingOnlyOnce {
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

        for(Map.Entry<Integer , Integer >entry:hm.entrySet()){
            if(entry.getValue()==1){
               System.out.println("the unique element is  : "+entry.getKey());
            }
        }
        
    }
}

/*
enter the array size : 
6
enter the array Element : 
1 1 2 2 2 3
the unique element  is : 3
*/
