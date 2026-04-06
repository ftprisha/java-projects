//bank acc using class using constructor
import java.util.*;

class p83{
    Scanner sc=new Scanner(System.in);
    int [] accno=new int[100];
    String [] name=new String[100];
    float [] bal=new float[100];
    int c=0;
    void account(String n){
        name[c]=n;
        bal[c]=100000;
        accno[c]=c;
        
        System.out.println("acoount created with number "+c);
        c++;

    }
    void deposit(float balance){
                System.out.println("enetr acc number");
                int an=sc.nextInt();
                for(int i=0;i<=c;i++){
                    if(i==an){
                        System.out.println("Deposited "+balance);
                        bal[i]+=balance;
                    }
                }
         }
         void withdraw(float amount){
            System.out.println("enter acc number");
             int an=sc.nextInt();
                for(int i=0;i<=c;i++){
                    if(i==an){
                        if (bal[i]<amount){
                    System.out.println("Insufficient balance");
                    }
                    else{   
                         System.out.println("Withdrew "+amount);
                bal[i]-=amount;
                         }
                    }
                }
            }
         void checkBalance(){
            System.out.println("enter acc number");
             int an=sc.nextInt();
                for(int i=0;i<=c;i++){
                    if(i==an){   
                System.out.println("Your balance is "+bal[i]);
         }
        }
         }
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        p83 o=new p83();
        
        while (true){
            System.out.println("Welcome to the bank");    
            System.out.println("1. Create account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check balance");
            System.out.println("5. Exit");
            System.out.println("Enter your choice: ");
            

            switch (sc.nextInt()) {
                case 1:{
                    System.out.println("Enter your name: ");
                    String n=sc.next();

                    o.account(n);
                    break;
                }
                case 2:
                    System.out.println("Enter the amount to deposit: ");
                    o.deposit(sc.nextFloat());

                    break;
                case 3:
                    System.out.println("Enter the amount to withdraw: ");
                    o.withdraw(sc.nextFloat());
                    break;
                case 4:
                    o.checkBalance();
                    break;
                case 5:
                    System.out.println("Thank you for using our bank!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
        