import java.util.Scanner;

public class Armstrong {
      public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number :");
        int n=sc.nextInt();
        int sum=0;
        String s=Integer.toString(n);
        int count=s.length();
        // System.out.println(count);
        
        while(n>0){
         int rem=n%10;
            n/=10;
           int total=1;
        //    System.out.println(rem);
           for(int i=1;i<=count;i++){
           total=total*rem;
           } 
           sum+=total;
        }
        if(n==sum){
            System.out.println("it is armstrong number :");
        }else{
            System.out.println("it is not armstrong numebr ");
        }
    }
}

/*
enter the number :
153
it is not armstrong numebr 


enter the number :
1356
it is not armstrong numebr 
*/
