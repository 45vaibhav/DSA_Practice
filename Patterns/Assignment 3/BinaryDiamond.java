import java.util.*;
public class BinaryDiamond {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size :");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }for(int k=1;k<=i;k++){
                if((k+i)%2==0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }


         for(int i=1;i<=n-1;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }for(int k=1;k<=n-i;k++){
                if((k+i)%2==0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}

/*
enter the size :
4
   1 
  0 1
 1 0 1
0 1 0 1
 1 0 1
  0 1
   1
*/
