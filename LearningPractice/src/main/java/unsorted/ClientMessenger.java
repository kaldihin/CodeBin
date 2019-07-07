import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientMessenger {
    private BufferedWriter writer;

    public static void main(String[] args) throws IOException {
        new ClientMessenger().createSocket();
        new ServerMessenger().createSocket();

        Scanner in = new Scanner(new InputStreamReader(System.in));
        while (in.hasNext()) {

        }
    }
    public void createSocket() throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(), 8081);
//        socket.connect();
    }

}
