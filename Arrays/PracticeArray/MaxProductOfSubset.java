import java.util.Arrays;

public class MaxProductOfSubset {
    public static void main(String args[]){
        int arr[]={-1,2,3,4};
        int product=1;
        int pastSum=1;
        int freq[]=new int[arr.length];
        Arrays.sort(arr);
        for(int i=arr.length-1;i>=0;i--){
            product*=arr[i];
           
        freq[i]=product;
           
    }Arrays.sort(freq);
    System.out.println("the maximum product is : "+freq[freq.length-1]);
}
}

/*
the maximum product is : 24
*/
