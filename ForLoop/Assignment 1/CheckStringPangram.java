import java.util.Scanner;

public class CheckStringPangram {
       public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string : ");
              String s=sc.nextLine();
            boolean ans=fun(s);
            System.out.println(ans);
       }
            public static boolean fun(String s){
                    
              for(int i=0;i<s.length();i++){
                int count=0;
                for(int j=0;j<s.length();j++){
                    if(s.charAt(i)==s.charAt(j)){
                        count++;
                    }
                }
                if(count==1){
                    return false;
                }

              }
               return true;
            }
 
}

/*
enter string : 
thequickbrownfoxjumpsoverthelazydog
true


enter string : 
fdjkfdfhjdksjdgdg
false
*/
