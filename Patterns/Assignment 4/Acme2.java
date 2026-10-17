public class Acme2 {
    public static void main(String args[]){
        int n=13;
        int number=5;
        int value=2;
        int p=2;
        for(int i=n;i>=1;i--){
            int temp=number;
            for(int j=1;j<=i;j++){

                if(value==p){
                    System.out.print(temp+" ");
                   temp+=5;
                    if(i==j){
                        value=(value+1)+p;
                        number+=5;
                    }

                }else{
                    System.out.print("*  ");
                }
            }
            p++;
            System.out.println();
        }

    }
}


/*
5 10 15 20 25 30 35 40 45 50 55 60 65 
*  *  *  *  *  *  *  *  *  *  *  *  
*  *  *  *  *  *  *  *  *  *  *  
10 15 20 25 30 35 40 45 50 55 
*  *  *  *  *  *  *  *  *  
*  *  *  *  *  *  *  *  
*  *  *  *  *  *  *  
*  *  *  *  *  *  
*  *  *  *  *  
15 20 25 30 
*  *  *  
*  *  
* 
*/
