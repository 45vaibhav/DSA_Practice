import java.util.Arrays;

public class UnionFrom2Arrays {
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7,8};
        int arr2[]={1,2,33,44,45};

        int max=45;
        int index=0;
        int freq[]=new int[max+1];
        int arr3[]=new int[arr.length+arr2.length];

        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }
        for(int i=0;i<arr2.length;i++){
            freq[arr2[i]]++;
        }

        for(int i=0;i<freq.length;i++){
            if(freq[i]!=0){
                arr3[index]=i;
                index++;
            }
        }
        System.out.println(Arrays.toString(arr3));
    }
}
