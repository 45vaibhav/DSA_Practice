public class LastOccuranceOfArrayElement {
    public static void main(String args[]){
        int arr[]={2,13,4,6,13,9,13,0,13,53};
        int target=13;
        int index=0;
        int last=fun(arr,index,target);
        System.out.println("the last occurance of array element is : "+last);
    }

    static int fun(int arr[], int index,int target){
                if(arr.length==index){
                    return -1;
                }

                int right=fun(arr, index+1,target);

                if(right!= -1){
                    return right;
                }

                if(arr[index]==target){
                    return index;
                }
                return -1;
    }
}


/*
the last occurance of array element is : 8
*/
