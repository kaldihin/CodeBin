package howto;

import java.sql.*;

public class ScrollableRowSetDatabase {
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

            Statement statement1 = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
//            PreparedStatement preparedStatement = connection.prepareStatement("", ResultSet.TYPE_SCROLL_INSENSITIVE);
ResultSet resultSet = statement1.executeQuery("select * from babe");
if (resultSet.next())
    System.out.println(resultSet.getString("name"));
if (resultSet.next())
    System.out.println(resultSet.getString("name"));
if (resultSet.previous())
    System.out.println(resultSet.getString("name"));
if (resultSet.relative(2))
    System.out.println(resultSet.getString("name"));
if (resultSet.relative(-2))
    System.out.println(resultSet.getString("name"));
if (resultSet.absolute(2))
    System.out.println(resultSet.getString("name"));

Statement statement2 = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
//PreparedStatement preparedStatement = connection.prepareStatement("", ResultSet.CONCUR_UPDATABLE);
ResultSet resultSet1 = statement2.executeQuery("select * from babe");
while (resultSet.next()) {
    System.out.println(resultSet.getInt("hasit"));
    System.out.println(resultSet.getString("name"));
}

resultSet1.last();
resultSet1.updateString("name", "new value");
resultSet1.updateRow();

resultSet1.moveToInsertRow();
resultSet1.updateString("name", "inserted");
resultSet1.insertRow();

resultSet1.absolute(2);
resultSet1.deleteRow();
        }
    }
}
