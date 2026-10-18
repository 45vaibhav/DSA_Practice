import java.util.HashMap;
import java.util.Scanner;

public class IsomorphicString {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=0;
        System.out.println("enter the string");
        String s=sc.next();
        String t=sc.next();
        if(s.length()!=t.length()){
            System.out.println("FALSE");
        }
        HashMap<Character,Character>hm=new HashMap<>();
        HashMap<Character,Character>hm2=new HashMap<>();

        for(int i=0;i<s.length();i++){

                if(hm.containsKey(s.charAt(i))){
                    if(hm.get(s.charAt(i))!=t.charAt(i)){
                        System.out.println("FALSE");
                        a++;
                    }
                }else{
                    hm.put(s.charAt(i),t.charAt(i));

                }


                if(hm2.containsKey(t.charAt(i))){
                    if(hm2.get(t.charAt(i))!=s.charAt(i)){
                        System.out.println("FALSE");
                        a++;
                    }
                }else{
                    hm2.put(t.charAt(i),s.charAt(i));
                    
                }
        }

        if(a==0){
            System.out.println("TRUE");
        }
        
    }
}


/*
enter the string
add
egg
TRUE
*/
