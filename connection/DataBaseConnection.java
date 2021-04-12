package connection;

import java.sql.*;

/**
 * @author Robert Chen
 * @author Wang HuaDong
 */
public class DataBaseConnection
{
    private final Connection conn;

    /**
     * 构造器
     */
    public DataBaseConnection() throws SQLException, ClassNotFoundException
    {
        String databaseDriver = "org.sqlite.JDBC";
        Class.forName(databaseDriver);
        String databaseUrl = "jdbc:sqlite:MyTestDatabase.sqlite";
        String databaseUser = "RobertChen";
        String password = "123456";
        conn = DriverManager.getConnection(databaseUrl, databaseUser, password);
    }

    /**
     * 获得连接
     */
    public Connection getConnection()
    {
        return this.conn;
    }

    /**
     * 关闭连接
     */
    public void close() throws SQLException
    {
        this.conn.close();
    }
}
