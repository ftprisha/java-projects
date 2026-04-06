//shopping cart system
import java.util.*;
class p66{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Product list:");
         String[]  products={"bread","Apple","milk","eggs","cheese","chocolate","chips","soda","cereal","juice","coffee","tea","cookies","yogurt","butter"};
       float[] price={50,35,30,15,70,40,25,70,250,80,20,15,30,65,50};
       String[] cart= new String[10];
       int item=0;
       int amt=0;
       
        while(true){
            System.out.println("1. View products");
            System.out.println("2. Add product to cart");
            System.out.println("3. View cart");
            System.out.println("4. Checkout");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            System.out.println("\n");
            int choice=sc.nextInt();
             switch(choice){
                case 1:
                    for (int i=0;i<products.length;i++){
                    System.out.println((i+1)+"."+products[i]+" - Rs."+price[i]);
                    }
                    System.out.println("\n");
                    break;
                case 2:{
                    System.out.println("enter product no.");
                    int e=sc.nextInt();
                    item++;
                    cart[item-1]=products[e-1];
                    amt+=price[e-1];
                    System.out.println("\n");
                
                   
                    break;
                }
                case 3:{
                    System.out.println("cart:");
                    for(int i=0;i<item;i++){
                        System.out.println(cart[i]);
                    }
                    System.out.println("\n");
                
                   
                    break;
                }
                case 4:{
                    System.out.println("Total amount: Rs."+amt);
                    System.out.println("Thank you for shopping with us!");
                    System.out.println("\n");
                
                 
                    break;
                }
                case 5:
                    System.out.println("Thank you for shopping with us!");
                    System.out.println("\n");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
             }
        }
       

    }
}