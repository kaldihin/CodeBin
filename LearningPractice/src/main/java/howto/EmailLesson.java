//package howto;
//
//import javax.mail.internet.InternetAddress;
//import javax.mail.internet.MimeMessage;
//import javax.net.ssl.SSLSession;
//import javax.mail.*;
//import java.util.Properties;
//
//public class EmailLesson {
//    public static void main(String[] args) throws Exception {
//        final Properties properties = new Properties();
//        properties.load(EmailLesson.class.getClassLoader().getResourceAsStream("mail properties"));
//
//        Session mailSession = Session.getDefaultInstance(properties);
//        MimeMessage message = new MimeMessage(mailSession);
//        message.setFrom(new InternetAddress("geniy9494"));
//        message.addRecipient(Message.RecipientType.TO, new InternetAddress("kaldihin@yandex.ru"));
//        message.setSubject("hello");
//        message.setText("Hi this is my test message");
//
//        Transport tr = mailSession.getTransport();
//        tr.connect(null, "123");
//        tr.sendMessage(message, message.getAllRecipients());
//        tr.close();
//
//    }
//}
