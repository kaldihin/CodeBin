package howto;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.*;

public class DatabaseCLOBAndBLOB {
    public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
        String username = "root";
        String password = "kaldihin";
        String connectionURL = "jdbc:mysql://localhost:3306/test?useSSL=false";
        Class.forName("com.mysql.jdbc.Driver");
        try(Connection connection = DriverManager.getConnection(connectionURL, username, password)) {
            System.out.println("Connected");
            Statement statement = connection.createStatement();
            statement.executeUpdate("drop table book");
            statement.execute("create table book(id1 integer not null auto_increment primary key, name1 char(30) not null, img blob)");
            BufferedImage image = ImageIO.read(new File("laugh.jpg"));
            Blob blob = connection.createBlob();
            try(OutputStream outputStream = blob.setBinaryStream(1)) {
                ImageIO.write(image, "jpg", outputStream);
            }
            PreparedStatement preparedStatement = connection.prepareStatement("insert into book (name1, img) values (?, ?)");
            preparedStatement.setString(1, "salomon");
            preparedStatement.setBlob(2, blob);
            preparedStatement.execute();

            ResultSet resultSet = statement.executeQuery("select * from book");
            while (resultSet.next()) {
                Blob blob2 = resultSet.getBlob(2);
                blob2.getBinaryStream();
                BufferedImage image2 = ImageIO.read(blob.getBinaryStream());
                File outputFile = new File("saved.png");
                ImageIO.write(image2, "png", outputFile);
            }
        }
    }
}
