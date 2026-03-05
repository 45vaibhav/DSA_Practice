import java.util.*;
public class NumberX {
    public static void main(String rags[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enetr the size :");
        int n=sc.nextInt();
        int temp=2;
        int temp1=1;
        for(int i=1;i<=n;i++){
            if(i>n/2+1){
                temp1=i-temp;
                temp+=2;
            }
            for(int j=1;j<=n;j++){
                if(i==j  || i+j==(n+1)){
                    if(i<=(n/2)+1){
                            System.err.print(i+" ");
                           
                    }else{
                         System.out.print(temp1+" ");
                    }
                }else{
                System.out.print(" "+" ");}
            }
            
            System.out.println();
           
        }
    }
}

/*
enetr the size :
9
1               1
  2           2
    3       3
      4   4
        5
      4   4
    3       3
  2           2
1               1
*/
