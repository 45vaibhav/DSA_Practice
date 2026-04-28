import java.util.Arrays;

public class Sort {
    public static void main(String args[]){
        int arr[]={1,1,0,0,1,2,2,0,0,0,2,2,2,2,2,2};

        for(int i=0;i<arr.length-1;i++){
            int minIndex=i;

            for(int j=i+1;j<arr.length;j++){
                if(arr[minIndex]>arr[j]){
                    minIndex=j;
            }
            }
            int temp=arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;

        }
        System.out.println(Arrays.toString(arr));
    }
}

/*

sorted array of 1s 2s 0s number containsss
[0, 0, 0, 0, 0, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2]


*/
