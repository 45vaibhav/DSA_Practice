import java.util.Scanner;

public class p9 {
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the number ");
        int n=sc.nextInt();

        fun(n);
    }

   static  void fun(int n){
            if(n<=1){
                System.out.print(n+" ");
                return ;
            }
            fun(n-1);
            System.out.print(n+" ");

            fun(n-2);


            
    }
}

/*
enter the number 
3
1 2 0 3 1 

enter the number 
4
1 2 0 3 1 4 1 2 0 

//many functions calls

*/
