package howto;

import java.sql.*;

public class DatabaseProcedures {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String userName = "root";
        String password = "kaldihin";
        String connectionUrl = "jdbc:mysql://localhost:3306/test?useSSL=false";
        Class.forName("com.mysql.jdbc.Driver");
        try(Connection connection = DriverManager.getConnection(
                connectionUrl, userName, password);
            Statement statement = connection.createStatement()) {
            System.out.println("We're connected");

            CallableStatement callableStatement = connection.prepareCall("{call someP(?)}");
            callableStatement.registerOutParameter(1, Types.INTEGER);
            callableStatement.execute();

//            System.out.println(callableStatement);
//            System.out.println("---------------------");

            ResultSet resultSet = callableStatement.getResultSet();
            while (resultSet.next()) {
                System.out.println(resultSet.getInt(1));
            }
            }
        }
    }
