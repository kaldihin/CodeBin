package howto;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class NetworkConnectionServer {
    public static void main(String[] args) throws Exception {
        try(ServerSocket serverSocket = new ServerSocket(8190)) {
            Socket socket = serverSocket.accept();
            Scanner scanner = new Scanner(socket.getInputStream());
            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
            writer.println("hello");
            while (scanner.hasNextLine()) {
                String str = scanner.nextLine();
                writer.println("You've send: " + str); //In console
                System.out.println(str);
                if (str.equals("exit")) {
                    break;
                }
            }
        }

    }
}
