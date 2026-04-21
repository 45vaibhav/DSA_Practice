public class UniqueEleUsingXOR {
    public static void main(String args[]){
        int arr[]={1,2,3,2,1};

        int result=0;

        for(int i=0;i<arr.length;i++){
            result=result^arr[i];
        }

        System.out.println(result);
    }
}

/*
3

*/
