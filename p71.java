//voting system
import java.util.*;
class p71{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age:");
        int age=sc.nextInt();
        String[] cand={"abc","cdf","def","ghi","ijk","lmn"};
        int[] votes=new int[cand.length];
        if(age>=18){
            
            while (true){
                System.out.println("1. View candidates");
                System.out.println("2. Vote");
                System.out.println("3. Display winner");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");
                int choice=sc.nextInt();
                switch(choice){
                    case 1:
                        System.out.println("Candidates:");
                        for(int i=0; i<cand.length; i++){
                            System.out.println((i+1)+". "+cand[i]);
                        }
                        break;
                    case 2:
                        System.out.println("enter candidate number to vote:");
                        int vote=sc.nextInt();
                        if(vote>=1 && vote<=cand.length){
                            votes[vote-1]++;
                            System.out.println("Vote recorded.");
                        }
                        else{
                            System.out.println("Invalid candidate number.");
                        }
                        break;
                    case 3:
                        System.out.println("Displaying winner...");
                        int maxVotes = 0;
                        int winnerIndex = 0;
                        for (int i = 0; i < votes.length; i++) {
                            if (votes[i] > maxVotes) {
                                maxVotes = votes[i];
                                winnerIndex = i;
                            }
                        }
                        System.out.println("Winner: " + cand[winnerIndex] + " with " + maxVotes + " votes.");
                        break;
                    case 4:
                        System.out.println("Exiting");
                        return;
                    default:
                        System.out.println("Invalid choice.");
                }
            }
        }
        else{
            System.out.println("You are not eligible to vote.");
        }


    }
}