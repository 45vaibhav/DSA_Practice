import java.util.Arrays;

public class selectionSort {
    public static void main(String args[]){
        int arr[]={7 , 3 , 5, 2,6};
        int minIndex=0;
        for(int i=0;i<arr.length-1;i++){
            minIndex=i;

            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minIndex]){
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
[2, 3, 5, 6, 7]
*/
