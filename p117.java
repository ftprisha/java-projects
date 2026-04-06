//project code for exception handling
import java.util.*;
class InsufficientBalanceException extends Exception{
    public InsufficientBalanceException (String message){
        super(message);
    }
}

class ATM{
    double balance=100;
    void withdraw (double amount)throws InsufficientBalanceException{
        if(amount>balance){
            throw new InsufficientBalanceException("Insufficient balance!");
        }
        balance -=amount;
        System.out.println("Withdrawal successful! Remaining balance: "+balance);
    }

    void deposit(double amount){
        balance +=amount;
        System.out.println("Deposit successful! Current balance: "+balance);
    }
    void checkBalance(){
        System.out.println("Current balance: "+balance);
    }
}

public class p117{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ATM atm  =new ATM();
        while(true){
            try{
                System.out.println("\n1.withdraw\n2.ddeposit\n3.check balance\n4.exit");
                System.out.println("enter choice");
                int choice=sc.nextInt();
                switch (choice){
                    case 1:
                        System.out.println("enter amount:");
                        atm.withdraw(sc.nextDouble());
                        break;
                
                case 2:
                    System.out.println("enter aamount:");
                    atm.deposit(sc.nextDouble());
                    break;

                case 3:
                    atm.checkBalance();
                    break;
                case 4 :
                    System.out.println("Thankyou");
                    sc.close();
                    break;
                default :
                    System.out.println("invalid choice!try again");
                }
                
            }
            catch (InsufficientBalanceException e){
                System.out.println("Error: "+e.getMessage());
            }
            catch (Exception e){
                System.out.println("invalid input! please enter numbers only");
                sc.nextLine();
            }
            finally {
                System.out.println("Transaction completed");
            }
        }

    }
}