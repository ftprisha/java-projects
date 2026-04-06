//train booking using class
import java.util.*;
class p85{
    String from;
    String to;
    int distance;;
    boolean booked=false;
    String[] name=new String[100];
    int fare=0;
    int[] age=new int[100];
    int speed=30;
    double time;
    int c;
    int child=0;
    int adult=0;
    void getdetails(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of commuters");
            c=sc.nextInt();
           
        for (int i = 0; i < c;i++){
            System.out.println("enter details for commuter "+(i+1)+" (name &age)");
            age[i]=sc.nextInt();
            name[i]=sc.nextLine();
            
          
        } 
        System.out.println("enter from and to and distance");
    
        from=sc.nextLine();
        to=sc.nextLine();
        distance=sc.nextInt();
        
    }
    void calc(){
       for(int i=0;i<c;i++){
              if (age[i]<5){
                fare+=0;
                child++;
              }
              else if (age[i]>=5 && age[i]<18){
                fare+=distance*3;
                adult++;
              }
              else {
                fare+=distance*5;
                adult++;
              }
       }
       time=distance/speed;
    }
    void book(){
        if (booked==false){
            booked=true;
            System.out.println("ticket booked");

        }
        else{
            System.out.println("no ticket left");
        }
    }
    void cancel(){
        if (booked ==true){
            booked=false;
            System.out.println("ticket cancelled");
        }
        else
            System.out.println("no ticket to cancel");
    }
    void display(){
        System.out.println("------Ticket Details------");
        System.out.println("From:"+from);
        System.out.println("To:"+to);
        System.out.println("Distance:"+distance);
        System.out.println("Number of commuters:"+c);
        System.out.println("Number of children:"+child);
        System.out.println("Number of adults:"+adult);
        System.out.println("Fare:"+fare);
        System.out.println("travel duration:"+time+" hours");
        System.out.println("------------------------------ ");
    }
    
    public static void main(String[] args){
        p85 t=new p85();
        t.getdetails();
        t.calc();
        t.book();
        t.display();
        t.cancel();

    }
}
