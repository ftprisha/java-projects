//socket
import java.io.*;
import java.net.*;
class server{
    public static void main(String[] args){
        try{
            ServerSocket ss=new ServerSocket(5001,l);
            System.out.println("Server is waiting for client...");
            Socket s=ss.accept();
            System.out.println("Client connected: "+s.getInetAddress());

            BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
            BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
            BufferedReader userInput=new BufferedReader(new InputStreamReader(System.in));
            while(true){
                String data=br.readLine();
                if(data.equalsIgnoreCase("exit")){
                    System.out.println("Client disconnected.");
                    break;
                }
                System.out.println("Client: "+data);

                System.out.print("you:");
                String msg=userInput.readLine();
                bw.write(msg);
                bw.newLine();
                bw.flush();

            }
            s.close();
            ss.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
