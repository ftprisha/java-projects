//password login system 
import java.util.*;

class p68{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the webpage");

        String[] usr = new String[100];
        String[] pass = new String[100];

        int ind = 0;

        while(true){

            System.out.println("1.Sign Up");
            System.out.println("2.Login");
            System.out.println("3.Leave page");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();  

            switch(choice){

                case 1:{
                    System.out.println("Enter username:");
                    String name = sc.nextLine();
                    System.out.println("Enter password:");
                    String word = sc.nextLine();
                    usr[ind] = name;
                    pass[ind] = word;
                    ind++;
                    System.out.println("Signup successful");
                    break;
                }
                case 2:{
                    System.out.println("Enter username:");
                    String name = sc.nextLine();
                    System.out.println("Enter password:");
                    String word = sc.nextLine();
                    boolean found = false;
                    for(int i=0;i<ind;i++){
                        if(usr[i].equals(name) && pass[i].equals(word)){
                            System.out.println("Login successful");
                            found = true;
                            break;
                        }
                    }

                    if(!found){
                        System.out.println("Wrong username/password");
                    }

                    break;
                }

                case 3:{
                    System.out.println("Thank you for visiting");
                    return;
                }

                default:{
                    System.out.println("Invalid choice");
                }
            }
        }
    }
}