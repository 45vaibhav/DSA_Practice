import java.util.HashMap;
import java.util.Scanner;

public class CheckStringAnagrams {
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the 1st string : ");
        String s=sc.nextLine();

         System.out.println("enter the 2nd string : ");
        String s1=sc.nextLine();

        HashMap<Character,Integer>hm=new HashMap<>();

        for(int i=0;i<s.length();i++){
            hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0)+1);
        }
        boolean ans=false;
       if(s.length()==s1.length()){
        for(int i=0;i<s1.length();i++){
            if(hm.containsKey(s.charAt(i))&& hm.get(s1.charAt(i))>0){
                ans=true;
                hm.put(s1.charAt(i),hm.get(s1.charAt(i))-1);
            }
        }
       }

        System.out.println("the string is anagram  : "+ans);
    }
}

/*
enter the 1st string : 
heart
enter the 2nd string : 
earth
the string is pangram  : true


enter the 1st string : 
dog
enter the 2nd string : 
god
the string is anagram  : true
*/
