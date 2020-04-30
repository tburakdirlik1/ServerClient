
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) throws IOException   {
        System.out.println("SERFVER SIDE IS WORKING ");
        ServerSocket server  = new ServerSocket(2020);
        Socket client = server.accept();
        
        while(true){
        
            //READ
        InputStreamReader IS = new InputStreamReader(client.getInputStream());
        BufferedReader BR = new BufferedReader(IS);
        //write
        PrintWriter print = new PrintWriter(client.getOutputStream());
      //response
        String incomingdata ="";
        incomingdata = BR.readLine();
        
        System.out.println("CLIENT : "+ incomingdata);
        Scanner scanner = new Scanner(System.in);
        
         System.out.print("SERVER -->");
        String outgoingdata = scanner.nextLine();
           
        print.println(outgoingdata);
        
        print.flush();
        
        
        } 
                
    }
    
}
