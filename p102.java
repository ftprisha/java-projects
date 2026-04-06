//bank system using all OOPS concepts
import java.util.*;
interface payment{
    public void pay(double amt);
}

class upi implements payment{
   public void pay(double amt){
        System.out.println("payment made through upi transaction");
}
}

class debit implements payment{
    public void pay(double amt){
        System.out.println("payment made through debit card");
    }
}

class credit implements payment{
    public void pay(double amt){
        System.out.println("payment made through credit card");
    }
}

class user{
    String name;
    double balance;

    user(String n,double b ){
        this.name=n;
        this.balance=b;
    }
    void display(){
        System.out.println("User-"+name);
        System.out.println("Balance-"+balance);
    }
}

class customer extends user{
    customer(String name, double b){
        super(name,b);
    }
    void deposit(double amt){
        balance+=amt;
        System.out.println("deposited amt-"+amt);
    }
    void withdraw(double amt){
        if(balance>=amt){
            balance-=amt;
            System.out.println("withdrawn amt-"+amt);

        }
        else
            System.out.println("insufficient balance");
    }

    void makepayment(payment p,double amt){
        if (balance>=amt){
            balance-=amt;
            p.pay(amt);
        }
        else{
            System.out.println("insufficient balance");
        }

    }
}

class p102{
    public static void main(String[] args){
        customer c=new customer("prisha",1000000);
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("1.display details");
            System.out.println("2.Deposit amount");
            System.out.println("3.Withdraw amount");
            System.out.println("4.make payement");
            System.out.println("5.exit");
            System.out.println("enetr choice");
            switch(sc.nextInt()){
                case 1:{
                    c.display();
                    break;
                }
                case 2:{
                    System.out.println("enter amount to deposit");
                    c.deposit(sc.nextDouble());
                    break;
                }
                case 3:{
                    System.out.println("enetr amount to withdraw");
                    c.withdraw(sc.nextDouble());
                    break;
                }
                case 4:{
                    System.out.println("enter payment method and amount\n1.UPI payment\n2.Debit card\n3.Credit card");
                    int ch=sc.nextInt();
                    double d=sc.nextDouble();
                    payment p;
                    if(ch==1){
                        p=new upi();

                    }
                    else if(ch==2){
                        p=new debit();
                    }
                    else if(ch==3){
                        p=new credit();
                    }
                    else{
                        System.out.println("invalid option");
                        break;
                    }
                    c.makepayment(p,d);
                    break;

                    
                }
                case 5:{
                    System.out.println("thankyou");
                    return;
                }
                default:
                    System.out.println("invalid choice");
                    
            }
        }

    }
}