import java.util.Scanner;

public class p8 {
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
            fun(n-1);
            System.out.print(n+" ");

            fun(n-2);

            

            
    }
}
