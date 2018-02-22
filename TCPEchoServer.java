import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.*;
import java.net.*;
//import httpRead;

public class TCPEchoServer {
    public static final int BUFSIZE= 1024;
    public static final int MYPORT= 80;

    public static void main(String[] args) throws IOException {
        byte[] buf= new byte[BUFSIZE];
System.out.println("Server running");
        /* Create socket */
        Socket socket= null;
        ServerSocket server=null;

        /* Create local bind point */
       try


       {
           server = new ServerSocket(MYPORT);
       }
       catch(IOException e)
       {e.printStackTrace();
       System.out.println("Server error");
       }
        while (true) {
            try {
                socket = server.accept();
                System.out.println("Connected to server");
                ServerThread S= new ServerThread(socket);
                S.start();
               }
            catch (IOException e)
            {
                System.out.println("ERROR:" + e);
            }

        }

        }

    public  static class ServerThread extends Thread {
        protected Socket socket=null;
        String message=null;
        BufferedReader is=null;
        PrintWriter os=null;
        public ServerThread(Socket socket) {
            this.socket=socket;
        }


        public void run() {

            try {
                is = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                os = new PrintWriter(socket.getOutputStream());
                os.write(message);

            } catch (IOException e) {
                System.out.println("error in server thread");
            }
            try
            {
                message = is.readLine();
                os.print(message);
                httpRead process= new httpRead(message);
                String contents=process.response();
                os.flush();
                os.print(contents);
                message = is.readLine();
            }
            catch (IOException e)
            {
                message = this.getName();
                System.out.println("Client" + message + "closed");
            }
        }}}
