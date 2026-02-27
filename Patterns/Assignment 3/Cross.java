import java.util.*;
public class Cross {
    public static void main(String rags[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("eneter the size :");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==j||i+j==n+1){
                    System.out.print(i+"");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

/*
eneter the size :
5
1   1
 2 2
  3
 4 4
5   5
*/
