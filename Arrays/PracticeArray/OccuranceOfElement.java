public class OccuranceOfElement {
    public static void main(String args[]){
        int arr[]={2,4,13,7,6,13,5,7};
        int index=0;
        int n=13;
       int last= fun(arr,n,index);

   
}

static int fun(int arr[], int n,int index){
    if(arr[index]==n){
        System.out.println(index);
        return index;
    }

    if(arr.length==index){
        return -1;
    }

    return fun(arr,n,index+1 );
}
}


// output : 2