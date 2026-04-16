import java.util.*;
public class MostFreqCharInString {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string : ");
        String s=sc.nextLine();

        int freq[]=new int[(int)'z'-'a'];
         
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
            int max=0;
           char ans='a';
        for(int i=0;i<freq.length;i++){
            if(freq[i]>max){
                max=freq[i];
                ans=(char)('a'+ i);
               
            }
        }
        System.out.println("the most frequent string is : "+ans);
        
    }
}

/*
enter the string : 
apple
the most frequent string is : p


enter the string : 
goodday
the most frequent string is : ddddd
*/
