import java.util.*;
class Sort{
    public static void main(String args[]){
        int arr[]={1 ,1,2,2,2,3,3};
        int freq[]=new int[arr.length];
        int index=0;

        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]){
                freq[index]=arr[i];
                index++;
            }
        }
        freq[index]=arr[arr.length-1];
        for(int i=0;i<freq.length;i++){
        System.out.println(freq[i]);
          }
    }

    

}

/*
1
2
3
0
0
0
0
*/