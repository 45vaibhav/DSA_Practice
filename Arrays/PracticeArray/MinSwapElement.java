import java.util.Arrays;

public class MinSwapElement {
    public static void main(String args[]){
        int arr[]={10,20,50,40};
        int count=0;

     Arrays.sort(arr);
    int arr1[]=new int[arr.length];

     for(int i=0;i<arr.length;i++){
       arr1[i]=arr[arr.length-1-i];
       if(i<3 && i>0){
        arr1[i]=arr[i];
        count++;
       }
     }
   
        System.out.println(Arrays.toString(arr1));
         System.out.println(count);
    }
    
    
}

/*
[50, 20, 40, 10]
2
*/
