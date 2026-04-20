import java.util.Arrays;

public class PlaceZeroAtLast {
    public static void main(String args[]){
        int arr[]={1,0,3,2,0,0,4};
        int index=0;
        int temp[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
           if(arr[i]!=0){
             arr[index]=arr[i];
            index++;
           }
        }

        for(int i=index;i<arr.length;i++){
            arr[i]=0;
        }

        System.out.println(Arrays.toString(arr));
    }
}

/*
[1, 3, 2, 4, 0, 0, 0]
*/
