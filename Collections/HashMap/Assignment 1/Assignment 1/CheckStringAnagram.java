import java.util.Arrays;
import java.util.Scanner;

public class CheckStringAnagram {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter 1st string : ");
        String s1=sc.nextLine();
        System.out.println("enter 2nd string : ");
        String s2=sc.nextLine();

        int freq[]=new int[(int)'z'-'a'+1];

        for(int i=0;i<s1.length();i++){
                freq[s1.charAt(i)-'a']++;
        }

        // System.out.println(Arrays.toString(freq));dog

                boolean ans=false;
            for(int i=0;i<s2.length();i++){
                if(freq[s2.charAt(i)-'a']==1){
                    ans=true;
                }else{
                    ans=false;
                }
            }
        System.out.println(ans);
        
    }
}

/*
enter 1st string : 
heart
enter 2nd string : 
earth
true



enter 1st string : 
dog
enter 2nd string : 
god
true
*/
