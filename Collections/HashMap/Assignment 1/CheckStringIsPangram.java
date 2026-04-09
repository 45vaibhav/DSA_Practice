import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CheckStringIsPangram {
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string : ");
        String s=sc.nextLine();

        HashMap<Character,Integer>hm=new HashMap<>();

        for(int i=0;i<s.length();i++){
            hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0)+1);
        }
        boolean ans=false;
       if(hm.size()==26){
        ans=true;
       }

        System.out.println("the string is pangram  : "+ans);
    }
}

/*
enter the string : 
thequickbrownfoxjumpsoverthelazydog
the string is pangram  : true



enter the string :
hellomynameisvaibhav
the string is pangram  : false
*/
