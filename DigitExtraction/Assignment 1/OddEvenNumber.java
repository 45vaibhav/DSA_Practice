import java.util.Scanner;

public class OddEvenNumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the numeber :");
        int n=sc.nextInt();
        if(n%2==0){
            System.out.println("Number is Even ");
        }else{
            System.out.println("Number is odd ");
        }
    }
}

/*
enter the numeber :
13
Number is odd 


enter the numeber :
46
Number is Even 
*/
