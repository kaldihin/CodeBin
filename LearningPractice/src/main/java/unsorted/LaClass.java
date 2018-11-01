package unsorted;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.*;

interface Inter {
    boolean returnValue(int n);
}

public class LaClass {
    public static void main(String[] args) throws Exception {
        Inter isNonNeg = (n) -> n >= 0;
        int c;
        InetAddress ia = InetAddress.getLoopbackAddress();
        InetAddress ia1 = InetAddress.getByName("www.vk.com");
        URL u = new URL("https://www.vk.com");
        URLConnection uc = u.openConnection();
        System.out.println(uc.getLastModified());

        System.out.println(u.getPort());
        System.out.println(u.getHost());
        System.out.println(u.getProtocol());
//        Socket s = new Socket(ia, 50379);
//        InputStream i = s.getInputStream();
//        OutputStream o = s.getOutputStream();
//        String str = "java.com";
//        byte buf[] = str.getBytes();
//        o.write(buf);
//        while ((c = i.read()) != -1) {
//            System.out.println((char)c);
//        }
        System.out.println(ia);
        System.out.println(ia1);
        System.out.println(isNonNeg.returnValue(7));
        System.out.println(isNonNeg.returnValue(-9));
//        s.close();
    }
}
