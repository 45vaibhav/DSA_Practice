import java.util.Scanner;

public class KaprekarNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number : ");
        int n=sc.nextInt();
       
        int square=n*n;
        int sum=0;
        while(square!=0){
            int rem=square%100;
            sum+=rem;
            square/=100;
        }
       
        if(n==sum){
            System.out.println("Kaprekar Number ");
        }else{
            System.out.println("not karpekar Number ");
        }

    }
}


/*
enter the number : 
45
Kaprekar Number 


enter the number : 
40
not karpekar Number 
*/
