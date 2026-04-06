interface notification{
    void notify(String msg);
    String gettype();
}
class email implements notification{
    public void notify(String msg){
        System.out.println("email notification: "+msg);
    }
    public String gettype(){
        return "email";
    }
}
class sms implements notification{
    public void notify(String msg){
        System.out.println("sms notification: "+msg);
    }
    public String gettype(){
        return "sms";
    }
}
class push implements notification{
    public void notify(String msg){
        System.out.println("push notification: "+msg);
    }
    public String gettype(){
        return "push";
    }
}
class whatsapp implements notification{
    public void notify(String msg){
        System.out.println("whatsapp notification: "+msg);
    }
    public String gettype(){
        return "whatsapp";
    }
}

class notificationservice{
    private notification n;
    public notificationservice(notification n){
        this.n=n;
    }
    public void sendnotification(String msg){
        n.notify(msg);
}

class p104{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        List <String>history=new ArrayList<>();
        while(true){
            System.out.println("1.email 2.sms 3.push 4.whatsapp 5.exit");
            int choice=sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:{
                    notificationservice ns=new notificationservice(new email());
                    ns.sendnotification("hello this is an email notification");
                    history.add("email: hello this is an email notification");
                    break;
                }
                case 2:{
                    notificationservice ns=new notificationservice(new sms());
                    ns.sendnotification("hello this is an sms notification");
                    history.add("sms: hello this is an sms notification");
                    break;
                }
                case 3:{
                    notificationservice ns=new notificationservice(new push());
                    ns.sendnotification("hello this is a push notification");
                    history.add("push: hello this is a push notification");
                    break;
                }
                case 4:{
                    notificationservice ns=new notificationservice(new whatsapp());
                    ns.sendnotification("hello this is a whatsapp notification");
                    history.add("whatsapp: hello this is a whatsapp notification");
                    break;
                }
                case 5:{
                    System.out.println("exiting...");
                    break;
                }
                default:{
                    System.out.println("invalid choice");
                }
            }
        }
        System.out.println("notification history:");
        for(String h:history){
            System.out.println(h);
        }   
    }
}
}