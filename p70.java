//electricity bill
import java.util.*;
class p70{
    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter number of unit");
        int n=sc.nextInt();
        int amt=0;
        if (n>=0 && n<=100 ){
            System.out.println("BILL AMOUNT:"+(n*2));

        }
        else if(n>=101 && n<=200){
            amt+=(100*2);
            n-=100;
            amt+= (n*3);
            System.out.println("BILL AMOUNT:"+amt);
        
        }
        else{
            amt+=(100*2);
            n-=100;
            amt+=(100*3);
            n-=100;
            amt+=(n*5);
            System.out.println("BILL AMOUNT:"+amt);


        }
    }
}