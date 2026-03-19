import java.util.Scanner;

public class p2 {
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the number ");
        int n=sc.nextInt();

        fun(n);
    }

   static  void fun(int n){
            if(n==0){
                return ;
            }

            System.out.print("X ");

            fun(n-1);

            System.out.print("Y ");

            fun(n-1);
    }
}
