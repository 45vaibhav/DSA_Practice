import java.util.Scanner;

public class StarAndNum {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size :");
        int n=sc.nextInt();
        int count=1;
        int val=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }if(i==count*count){
            for(int j=1;j<=i;j++){
                System.out.print("*  ");
                
            }
            val=i*10+10;
            count++;
        }else{
          val=i*10+10;
             for(int j=1;j<=i;j++){
                val=val+10;
                System.out.print(val+" ");
            }
        }
            System.out.println();
        }
    }
}
