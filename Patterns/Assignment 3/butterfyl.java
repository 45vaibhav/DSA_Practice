
import java.util.*;
public class butterfyl {
    public static void main(String rags[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size :");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }for(int k=1;k<=2*(n-i);k++){
                System.out.print("  ");
            }
            for(int l=i;l>=1;l--){
                System.out.print(l+" ");
               
            }
            System.out.println();
        }


        //INVERTED PATTERN 
        
          for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }for(int k=1;k<=2*(n-i);k++){
                System.out.print("  ");
            }
            for(int l=i;l>=1;l--){
                System.out.print(l+" ");
               
            }
            System.out.println();
        }

    }
}


/*
enter the size :
4
1             1 
1 2         2 1
1 2 3     3 2 1
1 2 3 4 4 3 2 1
1 2 3 4 4 3 2 1
1 2 3     3 2 1
1 2         2 1
1             1
*/
