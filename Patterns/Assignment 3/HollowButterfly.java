import java.util.*;

public class HollowButterfly {
     public static void main(String rags[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size :");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(i==j || j==1 || i==n){
                    System.out.print("* ");
                }else{
                    System.out.print(" ");
                }
            }for(int k=1;k<=2*(n-i);k++){
                System.out.print("  ");
            }
            for(int l=i;l>=1;l--){
                 if(i==l || l==n || l==1){
                    System.out.print("* ");
                }else{
                    System.out.print(" ");
                }
               
            }
            System.out.println();
        }


        //INVERTED PATTERN 
        
          for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }for(int k=1;k<=2*(n-i);k++){
                System.out.print("  ");
            }
            for(int l=i;l>=1;l--){
                System.out.print("* ");
               
            }
            System.out.println();
        }

    }
}
