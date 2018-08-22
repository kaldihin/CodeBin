package howto;

import java.sql.*;

public class DatabaseWithDates {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String userName = "root";
        String password = "kaldihin";
        String connectionUrl = "jdbc:mysql://localhost:3306/test?useSSL=false";
        Class.forName("com.mysql.jdbc.Driver");
        try(Connection connection = DriverManager.getConnection(
                connectionUrl, userName, password);
            Statement statement = connection.createStatement()) {
            System.out.println("We're connected");
            statement.executeUpdate("drop table book");
            statement.execute("create table book(id1 integer not null auto_increment primary key, name1 char(30) not null, dt date, img blob)");
            PreparedStatement preparedStatement = connection.prepareStatement("insert into book (name1, dt) values ('somename', ?)");
            preparedStatement.setDate(1, new Date(1533901125165L));
            preparedStatement.execute();
            System.out.println(preparedStatement);
            ResultSet resultSet = statement.executeQuery("select * from book");
            while (resultSet.next()) {
                System.out.println(resultSet.getDate("dt"));
            }
        }
    }
}
