package networks.example;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class networker {
    /*scans a range of TCP ports on a given host.
    @param args args[1]=host
    args[2]=startPort,args[3]=endport.
     */
    static void run(String[] args){
        //validate parameter count
        if (args.length != 4){
            System.out.println("Usage: scan <host> <startPort> <endPort>");
            return;
        }
        //parse command-line parameters
        String host = args[1];
        int startPort = Integer.parseInt(args[2]);
        int endPort = Integer.parseInt(args[3]);
        //Notify user of scan range
        System.out.println("Scanning ports " + startPort + "-" + endPort+ "on"+ host);
        //iterate over the port range
        for(int port = startPort; port <= endPort; port++){
            try(Socket s = new Socket()){
                //attempt connection with 200ms timeout
                s.connect(new InetSocketAddress(host,port),200);
                //if successful,the port is open
                System.out.println("Port open:"+ port);
            }
            catch (IOException ignored){
                //connection failed:port closed or filtered
            }
        }
    }
}
