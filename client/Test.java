package client;

import bean.Student;
import daoIMP.StudentDAOImpl;

import java.util.List;

/**
 * @author Robert Chen
 */
public class Test
{
    public static void main(String[] args)
    {
        StudentDAOImpl impl = new StudentDAOImpl();

        // 调用 findById() 方法，查询学号为 1 的学生信息
        System.out.println("> 查询学号为 1 的学生信息：");
        Student s1 = impl.findById(1);
        System.out.println("学号：" + s1.getId() + "，姓名：" + s1.getName());

        // 调用 insert() 方法，向数据库中插入一条学生信息
        System.out.println("\n> 插入学号为 5，姓名为 “Li Hua” 的学生：");
        Student s2 = new Student();
        s2.setId(5);
        s2.setName("Li Hua");
        impl.insert(s2);
        System.out.println("> 成功增加该学生信息！");

        // 查询该学生信息
        System.out.println("\n> 查询学号为 5 的学生信息：");
        Student s3 = impl.findById(5);
        System.out.println("学号：" + s3.getId() + "，姓名：" + s3.getName());

        // 调用 update() 方法，更新他的名字
        System.out.println("\n> 更新他的名字为 “Han MeiMei”");
        s3.setName("Han MeiMei");
        impl.update(s3);
        System.out.println("> 更新完成！\n" + "学号：" + s3.getId() + "，姓名：" + s3.getName());

        // 调用 delete() 方法，删除该学生信息
        System.out.println("\n> 删除该学生信息：<");
        impl.delete(5);
        System.out.println("> 删除成功！");

        // 调用 FindAll() 方法，浏览数据库全部学生信息
        System.out.println("\n> 所有学生信息如下：");
        List<Student> students = impl.findAll();
        students.forEach(s -> System.out.println("学号：" + s.getId() + "，姓名：" + s.getName()));
    }
}
