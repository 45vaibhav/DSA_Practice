import java.util.Scanner;

public class FibonacciSeries {
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number :");
        int n=sc.nextInt();
        int ans=fun(n);
        System.out.println("ans is : "+ans);
    }

    static int fun(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }

        int last=fun(n-1);
        int secondLast=fun(n-2);
        return last+secondLast;
    }
}

/*
enter the number :
4
ans is : 3

enter the number :
5
ans is : 5
*/
