import java.util.Scanner;

public class FreqGreaterThanK {
        public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array size : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the array elements : ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
          System.out.println("enter the k : ");
        int k=sc.nextInt();
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
            int freq[]=new int[max+1];

            for(int i=0;i<arr.length;i++){
                freq[arr[i]]++;
            }

            for(int i=0;i<freq.length;i++){
                if(k<freq[i]){
                   System.out.println("the  freq element greter than k : "+i);
                }
            }

            
    }
}

/*
enter the array elements : 
1 1 2 2 2 3
enter the k : 
2
the  freq element greter than k : 2
*/
