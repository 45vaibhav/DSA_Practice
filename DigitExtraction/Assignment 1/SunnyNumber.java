import java.util.Scanner;

public class SunnyNumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number : ");
        int n=sc.nextInt();
        int checkSquare=n+1;

        double squareroot=Math.sqrt(checkSquare);

        if(squareroot%1==0){
            System.out.println("Sunny number ");
        }else{
            System.out.println("not Sunny number ");
        }
    }
}


/*
enter the number : 
8
Sunny number 


enter the number : 
14
not Sunny number 
*/
