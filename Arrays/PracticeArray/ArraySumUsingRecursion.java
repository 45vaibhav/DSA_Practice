public class ArraySumUsingRecursion {
    public static void main(String args[]){
        int arr[]={4,6,3,5,6};
        int index=0;
        int sum=fun(arr,index);
        System.out.println( "the array sum is :"+sum);

    }
    static int fun(int arr[],int index){
        if(index==arr.length-1){
            return arr[index];
        }

        return arr[index]+fun(arr,index+1);
    }
}

/*

sum of arrays elementsc
the array sum is :24.......jjjjhhh
*/
