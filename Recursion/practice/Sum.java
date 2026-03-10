import java.util.*;
public class Sum {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number :");
        int n=sc.nextInt();
        int sum=fun(n);
        System.out.println("sum is : "+sum);
    }

    static int fun(int n){
        if(n==0){
            return 0;
        }

        int val=fun(n-1);
        return val+n;
    }
}

/*
enter the number :
3
sum is : 6


enter the number :
5
sum is : 15
*/
