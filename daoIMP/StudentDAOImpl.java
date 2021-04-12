package daoIMP;

import bean.Student;
import dao.StudentDAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import connection.DataBaseConnection;

/**
 * @author Robert Chen
 * @author Wang HuaDong
 */
public class StudentDAOImpl implements StudentDAO
{
    @Override
    public void insert(Student s)
    {
        String sql = "INSERT INTO student (id, name) values (?,?)";
        PreparedStatement pstmt;
        DataBaseConnection conn;
        try
        {
            conn = new DataBaseConnection();
            pstmt = conn.getConnection().prepareStatement(sql);
            pstmt.setLong(1, s.getId());
            pstmt.setString(2, s.getName());
            pstmt.executeUpdate();
            pstmt.close();
            conn.close();
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
    }

    @Override
    public void update(Student s)
    {
        String sql = "UPDATE student SET name =? Where id = ? ";
        PreparedStatement pstmt;
        DataBaseConnection conn;
        try
        {
            conn = new DataBaseConnection();
            pstmt = conn.getConnection().prepareStatement(sql);
            pstmt.setString(1, s.getName());
            pstmt.setLong(2, s.getId());
            pstmt.executeUpdate();
            pstmt.close();
            conn.close();
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
    }

    /**
     * TODO: 待完成的作业
     */
    @Override
    public void delete(long id)
    {
        String sql = "DELETE FROM student WHERE id = ?";
        PreparedStatement preparedStatement;
        DataBaseConnection connection;
        try
        {
            connection = new DataBaseConnection();
            preparedStatement = connection.getConnection().prepareStatement(sql);
            preparedStatement.setLong(1, id);
            preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
    }

    @Override
    public Student findById(long id)
    {
        Student student = null;
        String sql = "SELECT id, name FROM student Where id = ? ";
        PreparedStatement pstmt;
        DataBaseConnection conn;
        try
        {
            conn = new DataBaseConnection();
            pstmt = conn.getConnection().prepareStatement(sql);
            pstmt.setLong(1, id);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next())
            {
                student = new Student();
                student.setId(rs.getLong(1));
                student.setName(rs.getString(2));
            }
            rs.close();
            pstmt.close();
            conn.close();
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
        return student;
    }

    /**
     * TODO: 待完成的作业
     */
    @Override
    public List<Student> findAll()
    {
        Student student;
        String sql = "SELECT * FROM student";
        PreparedStatement pstmt;
        DataBaseConnection conn;
        List<Student> allStudents = new ArrayList<>();
        try
        {
            conn = new DataBaseConnection();
            pstmt = conn.getConnection().prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next())
            {
                student = new Student();
                student.setId(rs.getLong(1));
                student.setName(rs.getString(2));
                allStudents.add(student);
            }
            rs.close();
            pstmt.close();
            conn.close();
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
        return allStudents;
    }
}
