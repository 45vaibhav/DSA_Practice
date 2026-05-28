public class ArraysInversion {
    public static void main(String args[]){
    int arr[]={5,3,2,1,4};

    int count=0;
    for(int i=0;i<arr.length;i++){
        for(int j=i;j<arr.length;j++){
            if(arr[i]>arr[j]){
                count++;
            }
       
         } }
         System.out.println("the total array inversion count is : "+count);
    }
}

/*
the total array inversion count is : 7
*/
