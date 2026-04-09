import java.util.*;
public class SecondHighestFreqEle {
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

        int max=0;
        int secondMaxFreq=0;
        int maxFreq=0;
        System.out.println(hm);
        for(Map.Entry<Integer , Integer >entry:hm.entrySet()){
            if(entry.getValue()>max){
                secondMaxFreq=maxFreq;
                max=entry.getValue();
                maxFreq=entry.getKey();
            }
        }
        System.out.println("output : "+secondMaxFreq);
    }
}

/*
enter the array size : 
8
enter the array Element : 
1 2 2 3 3 3 4 4 
output : 2
*/
