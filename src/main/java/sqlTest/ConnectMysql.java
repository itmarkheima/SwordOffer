package sqlTest;

import java.sql.*;

public class ConnectMysql {

    static Connection conn;

    public static void main(String[] args) throws SQLException {
        try{
            Class.forName("com.mysql.jdbc.Driver");//加载数据库驱动
            String url="jdbc:mysql://localhost:3306/fruit?useSSL=false";
            String userName="root";
            String password="1234";
            conn = DriverManager.getConnection(url, userName, password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        String sql="select * from user";
        PreparedStatement preparedStatement = conn.prepareStatement(sql);

        ResultSet resultSet = preparedStatement.executeQuery();


    }
}
