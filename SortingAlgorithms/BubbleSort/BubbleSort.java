import java.util.Arrays;

public class BubbleSort {
    public static void main(String args[]){
        int arr[]={3,7,4,6,1,9};

        for(int i=0;i<arr.length-1;i++){
            boolean swap=false;

            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                    swap=true;
                }
            }

            if(!swap){
                break;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}

/*
[1, 3, 4, 6, 7, 9]
*/
