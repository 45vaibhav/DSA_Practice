import java.util.Scanner;

public class p11 {
      public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the n : ");
        int n=sc.nextInt();

        for(int i=1;i<=2*(n-1);i++){
            for(int j=1;j<=2*(n-1);j++){
               int top=i-1;
               int bottom=2*(n-1)-i;
               int right=2*(n-1)-i;
               int left=j-1;

               int layer=Math.min(Math.min(top,bottom), Math.min(left, bottom));

               System.out.print(n-layer+" ");
            } 
            System.err.println();
        }
    }
}

/*
enter the n : 
4
4 4 4 4 4 4 
4 3 3 3 3 3
4 3 2 2 2 2
4 3 2 2 2 2
4 3 3 3 3 3
4 4 4 4 4 4



Time Complexity : n*n = O(n^2)
Space Complexity : O(1)
*/

