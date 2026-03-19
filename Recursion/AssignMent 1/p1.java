import java.util.Scanner;

public class p1 {
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

            System.out.print(n+" ");

            fun(n-1);

            System.out.print((n+1)+" ");
    }
}


/*
enter the number 
3
3 2 1 2 3 4 
*/
