import java.util.Scanner;

public class ZigZagString {
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String ");
        String s=sc.next();
        System.out.println("Enter Row ");
        int n=sc.nextInt();


        int p=2*n-2;
        String s2="";

        if(n==1 || n>=s.length()){
             System.out.println("Original String : "+s);
        System.out.println("*****************************************************");
        System.out.println("Converted String : "+s);
        }
        for(int i=0;i<n;i++){

            for(int j=i;j<s.length();j+=p){

                s2=s2+s.charAt(j);

                int diagonal=p+j-2*i;

                if(i>0 && i<n-1 && diagonal<s.length()){
                    s2=s2+s.charAt(diagonal);
                }
            }
        }
        System.out.println("Original String : "+s);
        System.out.println("*****************************************************");
        System.out.println("Converted String : "+s2);

   
    }
}

/*
Enter String 
PAYPALISHIRING
Enter Row 
3
Original String : PAYPALISHIRING
*****************************************************
Converted String : PAHNAPLSIIGYIR
*/
