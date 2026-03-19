import java.util.Scanner;

public class p5 {
       public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the number ");
        int n=sc.nextInt();

        fun(n);
    }

   static  void fun(int n){
            if(n<=0){
                return ;
            }

            System.out.print(n+" ");

            fun(n-2);

            System.out.print(n+" ");
    }
}


/*
enter the number 
5
5 3 1 1 3 5 
*/
