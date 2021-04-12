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

        // ���� findById() ��������ѯѧ��Ϊ 1 ��ѧ����Ϣ
        System.out.println("> ��ѯѧ��Ϊ 1 ��ѧ����Ϣ��");
        Student s1 = impl.findById(1);
        System.out.println("ѧ�ţ�" + s1.getId() + "��������" + s1.getName());

        // ���� insert() �����������ݿ��в���һ��ѧ����Ϣ
        System.out.println("\n> ����ѧ��Ϊ 5������Ϊ ��Li Hua�� ��ѧ����");
        Student s2 = new Student();
        s2.setId(5);
        s2.setName("Li Hua");
        impl.insert(s2);
        System.out.println("> �ɹ����Ӹ�ѧ����Ϣ��");

        // ��ѯ��ѧ����Ϣ
        System.out.println("\n> ��ѯѧ��Ϊ 5 ��ѧ����Ϣ��");
        Student s3 = impl.findById(5);
        System.out.println("ѧ�ţ�" + s3.getId() + "��������" + s3.getName());

        // ���� update() ������������������
        System.out.println("\n> ������������Ϊ ��Han MeiMei��");
        s3.setName("Han MeiMei");
        impl.update(s3);
        System.out.println("> ������ɣ�\n" + "ѧ�ţ�" + s3.getId() + "��������" + s3.getName());

        // ���� delete() ������ɾ����ѧ����Ϣ
        System.out.println("\n> ɾ����ѧ����Ϣ��<");
        impl.delete(5);
        System.out.println("> ɾ���ɹ���");

        // ���� FindAll() ������������ݿ�ȫ��ѧ����Ϣ
        System.out.println("\n> ����ѧ����Ϣ���£�");
        List<Student> students = impl.findAll();
        students.forEach(s -> System.out.println("ѧ�ţ�" + s.getId() + "��������" + s.getName()));
    }
}
