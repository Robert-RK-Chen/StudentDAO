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
     * ������
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
     * �������
     */
    public Connection getConnection()
    {
        return this.conn;
    }

    /**
     * �ر�����
     */
    public void close() throws SQLException
    {
        this.conn.close();
    }
}
