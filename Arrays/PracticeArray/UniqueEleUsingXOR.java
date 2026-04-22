public class UniqueEleUsingXOR {
    public static void main(String args[]){
        int arr[]={2,6,5,8,11};

        int result=0;
        int target=14;
        for(int i=0;i<arr.length;i++){
            int sec=result;
            result=result^arr[i];
            if(result==target){
                System.out.println(sec);
                System.out.println(arr[i]);
            }
        }

        System.out.println(result);
    }
}

/*
3

*/
