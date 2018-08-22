package howto;

import java.sql.*;

public class DatabaseConnection {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String userName = "root";
        String password = "kaldihin";
        String connectionUrl = "jdbc:mysql://localhost:3306/test?useSSL=false";
        Class.forName("com.mysql.jdbc.Driver");
        try(Connection connection = DriverManager.getConnection(
                connectionUrl, userName, password);
            Statement statement = connection.createStatement()) {
            System.out.println("We're connected");
//            statement.execute("show databases");
//            statement.executeUpdate("drop table list");
//            statement.executeUpdate("create TABLE book (id1 integer primary key ,namet varchar(30) not null)");
//            statement.executeUpdate("insert into book (id1, namet) values (4, 'Typo'), (6, 'Ruto')");
//            ResultSet resultSet = statement.executeQuery("select * from babe");
//            while (resultSet.next()) {
//                System.out.print(resultSet.getString(1) + " " + '\t');
//                System.out.print(resultSet.getString(2) + " " + '\t');
//                System.out.print(resultSet.getInt(3) + " " + '\t');
//                System.out.println();
//            }

            String userId = "4";
//            ResultSet resultSet = statement.executeQuery("select * from babe where hasit = " + userId);
//            while (resultSet.next()) {
//                System.out.println("Boobs: " + resultSet.getString("boobs"));
//                System.out.println("Username: " + resultSet.getString("name"));
//            }
            PreparedStatement preparedStatement = connection.prepareStatement("select 'name' from babe where hasit = ?");
            preparedStatement.setString(1, userId);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                System.out.println("Username: " + resultSet.getString("name"));
                System.out.println("Hasit: " + resultSet.getString("hasit"));
            }
        }
    }
}
