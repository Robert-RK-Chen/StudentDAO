package dao;

import bean.*;

import java.util.*;

/**
 * @author Robert Chen
 * @author Wang HuaDong
 */
public interface StudentDAO
{
    /**
     * 向数据库中插入学生的信息
     *
     * @param s 一个学生的实例
     */
    void insert(Student s);

    /**
     * 更新数据库中学生的信息
     *
     * @param s 一个学生的实例
     */
    void update(Student s);

    /**
     * 删除数据库中学生的信息
     *
     * @param id 【字符串类型】学生的学号
     */
    void delete(long id);

    /**
     * 查询数据库中学号为iD的学生信息
     *
     * @param id 【长整型】学生的学号
     * @return Student 返回一个学生的实例
     */
    Student findById(long id);

    /**
     * 展示数据库中所有学生的信息
     *
     * @return List<Student> 返回一个学生的列表
     */
    List<Student> findAll();
}
