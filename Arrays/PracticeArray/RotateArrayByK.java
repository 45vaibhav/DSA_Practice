import java.util.Arrays;

public class RotateArrayByK {
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7};
        int k=2;

        int temp[]=new int[arr.length];
        int index=0;
        for(int i=k;i<arr.length;i++){
            temp[index]=arr[i];
            index++;
        }

        for(int i=0;i<k;i++){
            temp[index]=arr[i];
            index++;
        }

        System.out.println(Arrays.toString(temp));
    }
}

/*
[3, 4, 5, 6, 7, 1, 2]
*/
