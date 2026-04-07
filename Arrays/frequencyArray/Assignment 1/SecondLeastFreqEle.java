import java.util.Scanner;

public class SecondLeastFreqEle {
      public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array size : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the array elements : ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
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
        
            int leastFreq=arr.length;
            int secondLeastFreq=0;

            for(int i=0;i<freq.length;i++){
               if(freq[i] < leastFreq){
                  secondLeastFreq = leastFreq;
                  leastFreq = freq[i];
    } 
               else if(freq[i] > leastFreq && freq[i] < secondLeastFreq){
                  secondLeastFreq = freq[i];
    }
            }

            System.out.println("the second  least freq element : "+secondLeastFreq);
    }
}

/*
enter the array size : 
6
enter the array elements : 
1 1 2 2 2 3
the second  least freq element : 1
*/
