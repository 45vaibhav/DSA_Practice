import java.util.*;
public class SecondHighesFreqElement {
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
        
            int highFreq=0;
            int secondHighFreq=0;

            for(int i=0;i<freq.length;i++){
                if(highFreq<freq[i]){
                    secondHighFreq=highFreq;
                    highFreq=freq[i];
                   
                }
            }

             for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count==secondHighFreq){
                System.out.println("second max freq element is : "+arr[i]);
                
            }
        }
    }
}

/*
enter the array size : 
8
enter the array elements : 
1 2 2 3 3 3 4 4
the second high freq element : 2
*/
