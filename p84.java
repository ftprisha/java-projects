//library management using class
class p84{
    int bookid;
    String bookname;
    String name;
    boolean isissued=false;
    void issuebook(){
        if (isissued==false){
            isissued = true;
            System.out.println("issued succesfully");

        }
        else{
            System.out.println("book was not issued");
        }
    }
    void returnbook(){
        if(isissued==true){
            isissued=false;
            System.out.println("book returned succesfully");
        }
        else{
            System.out.println("book was not issued");
        }
    }
    void displaybook(){
        System.out.println("Book id:"+bookid);
        System.out.println("Book name:"+bookname);
        System.out.println("Author name:"+name);
        System.out.println("issued:"+isissued);
    }
    public static void main(String[] args){
        p84 b=new p84();
        b.bookid=101;
        b.bookname="once upon a time";
        b.name="prisha";
        b.displaybook();
        b.issuebook();
        b.displaybook();
        
        b.returnbook();
        b.displaybook();

    }

}