//restaurant management system

import java.util.*;
class p67{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("menu:");
         String[]  products={"mushroom soup","caesar salad","grilled chicken","pasta alfredo","margherita pizza","chocolate lava cake","ice cream sundae","coffee","tea","lemonade" };
       float[] price={150,220,350,380,400,250,280,40,35,30};
       String[] cart= new String[10];
       int item=0;
       int amt=0;
       
        while(true){
            System.out.println("1. View menu");
            System.out.println("2. Add item to order");
            System.out.println("3. View order");
            System.out.println("4. Checkout");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice=sc.nextInt();
             switch(choice){
                case 1:
                    for (int i=0;i<products.length;i++){
                    System.out.println((i+1)+"."+products[i]+" - Rs."+price[i]);
                    }
                    System.out.println("\n");
                    break;
                case 2:{
                    System.out.println("enter item no.");
                    int e=sc.nextInt();
                    item++;
                    cart[item-1]=products[e-1];
                    amt+=price[e-1];
                    System.out.println("\n");
                   
                    break;
                }
                case 3:{
                    System.out.println("order:");
                    for(int i=0;i<item;i++){
                        System.out.println(cart[i]);
                    }
                    System.out.println("\n");
                   
                    break;
                }
                case 4:{
                    System.out.println("Total amount: Rs."+amt);
                    System.out.println("Thank you for dining with us!");
                    System.out.println("\n");
                 
                    break;
                }
                case 5:
                    System.out.println("Thank you for dining with us!");
                    System.out.println("\n");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    System.out.println("\n");
             }
        }
       

    }
}