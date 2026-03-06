import java.util.*;

public class AllPrimeNumbers {
         public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number : ");
        int n=sc.nextInt();
        
        for(int i=2;i<=n;i++){
            int count=0;
            for(int j=1;j<=Math.sqrt(i);j++){
            if(i%j==0){
                count+=2;
            }
        }
        if(count==2){
            System.out.print(i+" ");
        }
    }
        
    }
}
