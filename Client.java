
package client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    
    public static void main(String[] args) throws IOException {
       System.out.println("CLIENT SIDE IS WORKING "); 
        Socket client = new Socket("127.0.0.1", 2020);
       
        while(true){
            InputStreamReader IS = new InputStreamReader(client.getInputStream());
            
            BufferedReader br = new BufferedReader (IS);
            PrintWriter print = new PrintWriter(client.getOutputStream());
            
 
            System.out.print("CLIENT -->");
            Scanner scanner = new Scanner (System.in);
            
            print.println(scanner.nextLine());
            print.flush();
            
            System.out.println("SERVER -->" + br.readLine());
            
        }
    }
    
}
