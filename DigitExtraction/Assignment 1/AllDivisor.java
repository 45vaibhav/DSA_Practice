import java.util.*;
public class AllDivisor {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number : ");
        int n=sc.nextInt();
        for(int i=1;i<=Math.sqrt(n);i++){
            int quotient=n/i;
            if(n%i==0){
                System.out.print(i+" ");
                System.out.print(quotient+" ");
            }
        }

    }
}

/*
enter the number : 
12
1 12 2 6 3 4
*/
