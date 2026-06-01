import java.util.HashMap;
import java.util.Scanner;

public class SubArraycount {
      public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Arrray : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array elements : ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int k=6;
        HashMap<Integer , Integer >hm=new HashMap<>();

        int sum=0;
        int count=0;
        hm.put(0,1);

        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(hm.containsKey(sum-k)){
                count=count+hm.get(sum-k);
            }
            hm.put(sum,hm.getOrDefault(sum, 0)+1);
        }
        System.out.println("the count : "+count);
    }
}

/*
Enter the size of Arrray : 
3
Enter the array elements : 
1 1 1
the count : 2

Enter the size of Arrray : 
5
Enter the array elements : 
1 3 2 4 6
the count : 3
*/
