import java.util.Scanner;

public class MostFrequentCharInString {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string : ");
              String s=sc.nextLine();
                int max=0;
                int freq=0;
              for(int i=0;i<s.length();i++){
                int count=0;
                for(int j=0;j<s.length();j++){
                    if(s.charAt(i)==s.charAt(j)){
                        count++;
                    }
                }
                if(count>max){
                    freq=i;
                    max=count;
                }

              }
              System.out.println("the most frequent element is : "+s.charAt(freq));
    }
        }


        /*
        enter string : 
        apple
        the most frequent element is : p
        */

