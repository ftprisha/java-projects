//linked list project
import java.util.*;
class Node{
    String name;
    int rollno;
    int marks;
    Node next;
    Node(String n,int r,int m){
        this.name=n;
        this.rollno=r;
        this.marks=m;
        this.next=null;
    }

}
class linkedlist{
    Node head,tail;
//add student name roll no aand marks
    void add(String name,int rollno,int marks){
        Node n=new Node(name,rollno,marks);
        if(head==null){
            head=tail=n;
        }
        else{
            tail.next=n;
            tail=n;
        }
    }
    //display all students
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.name+" "+temp.rollno+" "+temp.marks+" ");
             System.out.println();
            temp=temp.next;
        }
        System.out.println();
    }
    //search student by roll no
    public boolean search(int rollno){
        Node temp=head;
        while(temp!=null){
            if(temp.rollno==rollno){
                System.out.println(temp.name+" "+temp.rollno+" "+temp.marks);
                return true;
            }
            temp=temp.next;
        }
        return false;
    }
    //delete student by roll no
    public void delete(int rollno){
        Node temp=head,prev=null;
        while(temp!=null){
            if(temp.rollno==rollno){
                if(prev==null){
                    head=temp.next;
                }
                else{
                    prev.next=temp.next;
                }
                return;
            }
            prev=temp;
            temp=temp.next;
        }
    }

}
public class linkedlistproject {
    public static void main(String[] args) {
        linkedlist list=new linkedlist();
        Scanner sc=new Scanner(System.in);
        int choice;
        while(true){
            System.out.println("1.add student");
            System.out.println("2.display all students");
            System.out.println("3.search student by roll no");
            System.out.println("4.delete student by roll no");
            System.out.println("5.exit");
            choice=sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("enter name roll no and marks");
                String name=sc.next();
                int rollno=sc.nextInt();
                int marks=sc.nextInt();
                list.add(name,rollno,marks);
                break;
            case 2:
                list.display();
                break;
            case 3:
                System.out.println("enter roll no to search");
                int r=sc.nextInt();
                if(list.search(r)){
                    System.out.println("student found");
                }
                else{
                    System.out.println("student not found");
                }
                break;
            case 4:
                System.out.println("enter roll no to delete");
                int r1=sc.nextInt();
                list.delete(r1);
                break;
            case 5:
                System.out.println("exiting...");
                System.exit(0);
            default:
                System.out.println("invalid choice");
        }
        }
        
    
}
}