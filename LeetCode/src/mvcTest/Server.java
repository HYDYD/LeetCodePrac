package mvcTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by HYDYD.
 * 2019/7/8 21:38
 */
public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(8080);
            Socket socket = server.accept();
            BufferedReader is = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String line = is.readLine();
            System.out.println("received from client" + line);
            PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
            printWriter.println("received data " + line);
            printWriter.flush();
            printWriter.close();
            is.close();
            socket.close();
            server.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
