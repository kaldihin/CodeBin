import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMessenger {

    private static final int PORT = 8081;

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(PORT);
        new Handler(serverSocket.accept());
    }

    private static class Handler {
        private BufferedReader reader;
        private Socket socket;
        public Handler(Socket socket) {
            this.socket = socket;
        }
        public void handlerLogic() throws IOException {

            reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//            try {
//                reader = new BufferedReader()
//            }
        }
    }

    void createSocket() throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(), 8081);

    }
}
