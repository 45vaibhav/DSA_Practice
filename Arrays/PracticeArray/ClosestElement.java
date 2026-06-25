import java.util.Scanner;

public class ClosestElement {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of Array : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the array elements : ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter target : ");
        int target=sc.nextInt();

        int low =0;
        int high =arr.length-1;
        int ans=-1;
        while(low<high){
            int mid=low+(high-low)/2;
            if(arr[mid]>=target){
                ans=mid;
                low=mid+1;
            }else{
                high=mid-1;
            }

        }
        if(target-arr[ans-1]<arr[ans]-target){
            System.out.println("ans is : "+arr[ans-1]);
        }else{
                System.out.println("ans is : "+arr[ans]);
        }
    }
}
