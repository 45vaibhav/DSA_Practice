import java.util.Scanner;

public class StringsAnagram {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter frist string : ");
              String s1=sc.nextLine();
            System.out.println("enter frist string : ");
              String s2=sc.nextLine();
            boolean ans=fun(s1,s2);
            System.out.println(ans);
       }
            public static boolean fun(String s1,String s2){
                    
              for(int i=0;i<s1.length();i++){
                int count=0;
                for(int j=0;j<s2.length();j++){
                    if(s1.charAt(i)==s2.charAt(j)){
                        count++;
                    }
                }
                if(count>1){
                    return false;
                }

              }
               return true;
            }
}

/*
enter frist string : 
heart
enter frist string : 
earth
true


enter frist string : 
google 
enter frist string : 
goggle
false
*/
