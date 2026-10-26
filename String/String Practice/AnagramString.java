import java.util.HashMap;
import java.util.Scanner;

public class AnagramString {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter first string : ");
        String s=sc.next();
        System.out.println("Enter second string : ");
        String t=sc.next();


        if(s.length()!=t.length()){
            System.out.println("Not anagram ");
        }

        HashMap<Character,Integer>hm=new HashMap<>();
         HashMap<Character,Integer>hm2=new HashMap<>();
        for(int i=0;i<s.length();i++){
            hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i), 0)+1);
        }

        for(int i=0;i<t.length();i++){
            hm2.put(t.charAt(i),hm2.getOrDefault(t.charAt(i), 0)+1);
        }
        for(int i=0;i<s.length();i++){
            if(hm.get(s.charAt(i))!=hm2.get(s.charAt(i))){
                System.out.println("Not Anagram");
                break;
            }
            if(i==s.length()-1){
                System.out.println("ANAGRAM");
            }
            
        }
    }
}

/*
1),,,
Enter first string : 
eat
Enter second string : 
tea
ANAGRAM

2)...
Enter first string :ll 
hood
Enter second string : 
gklsll
Not Anagram
*/
