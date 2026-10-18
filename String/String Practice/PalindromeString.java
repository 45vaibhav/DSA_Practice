import java.util.ArrayList;

public class PalindromeString {
   
    public static void main(String args[]){
        String s="Never odd or even";

        String s1=s.toLowerCase();

        ArrayList<Character>ls=new ArrayList<>();

        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=' '){
                    ls.add(s1.charAt(i));
            }
        }

        String first="";

    for(int i=0;i<ls.size()/2;i++){
        first=first.concat(String.valueOf(ls.get(i)));
    }
      String last="";

    for(int i=ls.size()-1;i>=(ls.size()+1)/2;i--){
        last=last.concat(String.valueOf(ls.get(i)));
    }
        boolean ans;
    if(first.equals(last)){
        ans=true;
    }
    else{
        ans=false;
    }
    System.out.println("the anser is : "+ans);
    }
}

/*
the anser is : true
*/
